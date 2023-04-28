package Clients;

import com.power.service.GetEnergyConsumptionRequest;
import com.power.service.GetEnergyConsumptionResponse;
import com.power.service.GetTotalEnergyConsumptionRequest;
import com.power.service.GetTotalEnergyConsumptionResponse;
import com.power.service.SetMaxEnergyLimitRequest;
import com.power.service.SetMaxEnergyLimitResponse;
import com.power.service.SmartPowerServiceGrpc;
import com.power.service.SmartPowerServiceGrpc.SmartPowerServiceBlockingStub;
import com.power.service.SmartPowerServiceGrpc.SmartPowerServiceStub;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.CountDownLatch;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SmartCityClientGUI extends Application {
	static SmartPowerServiceBlockingStub blockingstub1;
	static SmartPowerServiceStub ascyStub1;
	static TextArea serverResponse;
	private static ServiceInfo powerServiceInfo;
	
	

    public static void main(String[] args) {
    	
		String power_service_type = "_power._tcp.local.";
		//discoverPowerService(power_service_type);
		
		//String host = powerServiceInfo.getHostAddresses()[0];
		//System.out.println("TEsting : " +host);
		//int port = powerServiceInfo.getPort();
		
		ManagedChannel channel1 = ManagedChannelBuilder
				.forAddress("192.168.56.1", 50052)
				.usePlaintext()
				.build();
		
		blockingstub1 = SmartPowerServiceGrpc.newBlockingStub(channel1);
		ascyStub1 = SmartPowerServiceGrpc.newStub(channel1);
   
	        launch(args);

	  

    }
    
private static void discoverPowerService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Power Service resolved: " + event.getInfo());

					powerServiceInfo = event.getInfo();

					int port = powerServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + powerServiceInfo.getNiceTextString());
					System.out.println("\t host: " + powerServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Power Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Power Service added: " + event.getInfo());

					
				}
			});
			
			// Wait a bit
			Thread.sleep(15000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
		
    
    @SuppressWarnings("restriction")
	@Override
    public void start(Stage primaryStage) {
        // Server response area
        serverResponse = new TextArea();
        serverResponse.setEditable(false);
        serverResponse.setPromptText("Server Response");
        serverResponse.setPrefSize(500, 300);

        // RPC1 components
        ChoiceBox<Integer> deviceIdChoiceBox = new ChoiceBox<>();
        deviceIdChoiceBox.getItems().addAll(1, 2, 3);
        Button getEnergyConsumptionButton = new Button("Get Energy Consumption");
        getEnergyConsumptionButton.setOnAction(e -> {
            int deviceId = deviceIdChoiceBox.getValue();
            getEnergyConsumption(deviceId);
        });

        // RPC2 components
        TextField maxEnergyLimitField = new TextField();
        maxEnergyLimitField.setPromptText("Max Energy Limit");
        Button setMaxEnergyLimitButton = new Button("Set Max Energy Limit");
        setMaxEnergyLimitButton.setOnAction(e -> {
            int maxEnergyLimit = Integer.parseInt(maxEnergyLimitField.getText());
            setMaxEnergyLimit(maxEnergyLimit);
        });

        // RPC3 components
        ChoiceBox<Integer> deviceIdChoiceBox3 = new ChoiceBox<>();
        deviceIdChoiceBox3.getItems().addAll(1, 2, 3);
        Button getTotalEnergyConsumptionButton = new Button("Get Total Energy Consumption");
        getTotalEnergyConsumptionButton.setOnAction(e -> {
            int[] deviceIds = new int[]{deviceIdChoiceBox3.getValue()};
            getTotalEnergyConsumption(deviceIds);
        });
        Button completeStreamingButton = new Button("Complete Streaming");

        // Layout
        VBox root = new VBox(15);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(
                serverResponse,
                new HBox(10, new Label("Device ID:"), deviceIdChoiceBox, getEnergyConsumptionButton),
                new HBox(10, new Label("Max Energy Limit:"), maxEnergyLimitField, setMaxEnergyLimitButton),
                new HBox(10, new Label("Device ID:"), deviceIdChoiceBox3, getTotalEnergyConsumptionButton, completeStreamingButton)
        );

        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Smart City Client");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void getEnergyConsumption(int deviceId) {
        GetEnergyConsumptionRequest request = GetEnergyConsumptionRequest.newBuilder()
            .setDeviceId(deviceId)
            .build();
        GetEnergyConsumptionResponse response = blockingstub1.getEnergyConsumption(request);
        System.out.println("Energy consumption: " + response.getEnergyConsumption());
        serverResponse.appendText("Energy consumption: " + response.getEnergyConsumption()+"\n");
    }

    public void setMaxEnergyLimit(int maxEnergyLimit) {
        SetMaxEnergyLimitRequest request = SetMaxEnergyLimitRequest.newBuilder()
            .setMaxEnergyLimit(maxEnergyLimit)
            .build();
        StreamObserver<SetMaxEnergyLimitResponse> responseObserver = new StreamObserver<SetMaxEnergyLimitResponse>() {
            @SuppressWarnings("restriction")
			@Override
            public void onNext(SetMaxEnergyLimitResponse response) {
                System.out.println("Message: " + response.getMessage());
                System.out.println("Current max energy limit: " + response.getCurrentMaxEnergyLimit());
                serverResponse.appendText("Message: " + response.getMessage()
                					+"\n" + "Current max energy limit: " + response.getCurrentMaxEnergyLimit()+"\n");
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("setMaxEnergyLimit completed");
            }
        };
        ascyStub1.setMaxEnergyLimit(request, responseObserver);
    }
    public void getTotalEnergyConsumption(int[] deviceIds) {
        CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<GetTotalEnergyConsumptionRequest> requestObserver = ascyStub1.getTotalEnergyConsumption(new StreamObserver<GetTotalEnergyConsumptionResponse>() {
            @Override
            public void onNext(GetTotalEnergyConsumptionResponse response) {
                System.out.println("Total energy consumption: " + response.getMessage());
                serverResponse.appendText("Total energy consumption: " + response.getMessage()+"\n");
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("getTotalEnergyConsumption completed");
                finishLatch.countDown();
            }
        });

        for (int deviceId : deviceIds) {
            GetTotalEnergyConsumptionRequest request = GetTotalEnergyConsumptionRequest.newBuilder()
                    .setDeviceId(deviceId)
                    .build();
            requestObserver.onNext(request);
        }

        requestObserver.onCompleted();
        try {
            finishLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
		
}
