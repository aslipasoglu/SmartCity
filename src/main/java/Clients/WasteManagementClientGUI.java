package Clients;

import com.waste.service.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class WasteManagementClientGUI extends Application {
    static SmartWasteManagementServiceGrpc.SmartWasteManagementServiceBlockingStub blockingStub;
    static SmartWasteManagementServiceGrpc.SmartWasteManagementServiceStub asyncStub;
    private StreamObserver<GetCustomizedRouteRequest> routeStreamObserver;
    private static int inputStage = 1;
    private static int binLevel1 = 0;
    private static int binLevel2 = 0;
    private TextField binLevelField;

    static TextArea serverResponse;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("192.168.56.1", 50053)
                .usePlaintext()
                .build();

        asyncStub = SmartWasteManagementServiceGrpc.newStub(channel);
        blockingStub = SmartWasteManagementServiceGrpc.newBlockingStub(channel);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Server response area
        serverResponse = new TextArea();
        serverResponse.setEditable(false);
        serverResponse.setPromptText("Server Response");
        serverResponse.setPrefSize(500, 300);

        // RPC1 components
        binLevelField = new TextField(); // Modify this line
        binLevelField.setPromptText("Bin Level");
        Button getCustomizedRouteButton = new Button("Get Customized Route");
        getCustomizedRouteButton.setOnAction(e -> {
            int binLevel = Integer.parseInt(binLevelField.getText());
            getCustomizedRoute(binLevel);
        });
        
        // RPC2 components
        ChoiceBox<String> cityChoiceBox = new ChoiceBox<>();
        cityChoiceBox.getItems().addAll("Cork", "Dublin");
        Button getBinLocatorButton = new Button("Get Bin Locator");
        getBinLocatorButton.setOnAction(e -> {
            String currentLocation = cityChoiceBox.getValue();
            getBinLocator(currentLocation);
        });

        // Layout
        VBox root = new VBox(15);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(
                serverResponse,
                new HBox(10, new Label("Bin Level 1:"), binLevelField, getCustomizedRouteButton),
                new HBox(10, new Label("Current Location:"), cityChoiceBox, getBinLocatorButton)
        );

        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Waste Management Client");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void getCustomizedRoute(int binLevel) {
        GetCustomizedRouteRequest request = GetCustomizedRouteRequest.newBuilder()
                .setBinLevel1(binLevel)
                .build();

        StreamObserver<GetCustomizedRouteResponse> responseObserver = new StreamObserver<GetCustomizedRouteResponse>() {
            @Override
            public void onNext(GetCustomizedRouteResponse response) {
                System.out.println("Optimized route: " + response.getOptimizedRoute());
                serverResponse.appendText("Optimized route: " + response.getOptimizedRoute() + "\n");
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("getCustomizedRoute completed");
            }
        };

        if (inputStage == 1) {
            routeStreamObserver = asyncStub.getCustomizedRoute(responseObserver);
            routeStreamObserver.onNext(request);
            binLevel1 = binLevel;
            inputStage = 2;
            binLevelField.clear();
            binLevelField.setPromptText("Enter 2nd Bin Level");
        } else if (inputStage == 2) {
            routeStreamObserver.onNext(request);
            routeStreamObserver.onCompleted();
            inputStage = 1;
            binLevelField.clear();
            binLevelField.setPromptText("Enter 1st Bin Level");
        }
    }



    public void getBinLocator(String currentLocation) {
        GetBinLocatorRequest request = GetBinLocatorRequest.newBuilder()
                .setCurrentLocation(currentLocation)
                .build();

        GetBinLocatorResponse response = blockingStub.getBinLocator(request);
        System.out.println("Closest Bin: " + response.getNearestRecyclingBin());
        serverResponse.appendText("Closest Bin: " + response.getNearestRecyclingBin() + "\n");
    }

}


       
