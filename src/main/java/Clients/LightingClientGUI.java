package Clients;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import com.lighting.service.SmartPublicLightingServiceGrpc.SmartPublicLightingServiceBlockingStub;
import com.lighting.service.TurnOnAndOffLightingRequest;
import com.lighting.service.TurnOnAndOffLightingResponse;
import com.lighting.service.AdjustLightingRequest;
import com.lighting.service.AdjustLightingResponse;
import com.lighting.service.SmartPublicLightingServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class LightingClientGUI extends Application {

	static SmartPublicLightingServiceBlockingStub blockingstub;
	static TextArea serverResponse;
	private static ServiceInfo lighthingServiceInfo;
	

    public static void main(String[] args) {
    	
    	String lightning_service_type = "light._tcp.local.";
		//discoverPowerService(lightning_service_type);
		
		//String host = lighthingServiceInfo.getHostAddresses()[0];
		//int port = lighthingServiceInfo.getPort();
		
		ManagedChannel channel1 = ManagedChannelBuilder
				.forAddress("192.168.56.1", 50052)
				.usePlaintext()
				.build();
		
		blockingstub = SmartPublicLightingServiceGrpc.newBlockingStub(channel1);

        launch(args);
    }
    
private static void discoverPowerService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Lighthing Service resolved: " + event.getInfo());

					lighthingServiceInfo = event.getInfo();

					int port = lighthingServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + lighthingServiceInfo.getNiceTextString());
					System.out.println("\t host: " + lighthingServiceInfo.getHostAddresses()[0]);
				
					
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
			Thread.sleep(2000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}@Override
public void start(Stage primaryStage) {

    ComboBox<String> lightLevelComboBox = new ComboBox<>();
    lightLevelComboBox.getItems().addAll("Low", "Medium", "High");

    Slider timeSlider = new Slider(0, 24, 0);
    timeSlider.setShowTickLabels(true);
    timeSlider.setShowTickMarks(true);

    Label timeLabel = new Label("Time: 0");
    timeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
        timeLabel.setText("Time: " + newValue.intValue());
    });

    TextField locationTextField1 = new TextField();
    locationTextField1.setPromptText("Location");

    TextArea responseTextArea = new TextArea();
    responseTextArea.setEditable(false);
    responseTextArea.setPromptText("Server Response");

    Button adjustLightingButton = new Button("Adjust Lighting");
    adjustLightingButton.setOnAction(e -> {
        AdjustLightingRequest request = AdjustLightingRequest.newBuilder()
                .setLightLevel(lightLevelComboBox.getValue())
                .setTime((int) timeSlider.getValue())
                .setLocation(locationTextField1.getText())
                .build();
        AdjustLightingResponse response = blockingstub.adjustLighting(request);
        responseTextArea.appendText("Brightness: " + response.getBrightness() + "\n");
    });

    TextField locationTextField2 = new TextField();
    locationTextField2.setPromptText("Location");

    ComboBox<Boolean> isOnComboBox = new ComboBox<>();
    isOnComboBox.getItems().addAll(Boolean.TRUE, Boolean.FALSE);

    Button turnOnOffButton = new Button("Turn On/Off");
    turnOnOffButton.setOnAction(e -> {
        TurnOnAndOffLightingRequest request = TurnOnAndOffLightingRequest.newBuilder()
                .setLocation(locationTextField2.getText())
                .setIsOn(isOnComboBox.getValue())
                .build();
        TurnOnAndOffLightingResponse response = blockingstub.turnOnAndOffLighting(request);
        responseTextArea.appendText("Message: " + response.getMessage() + "\nStatus Code: " + response.getStatusCode() + "\n");
    });

    VBox root = new VBox(10,
            new HBox(10, new Label("Light Level:"), lightLevelComboBox),
            new HBox(10, timeLabel, timeSlider),
            new HBox(10, new Label("Location:"), locationTextField1),
            adjustLightingButton,
            new HBox(10, new Label("Location:"), locationTextField2),
            new HBox(10, new Label("Is On:"), isOnComboBox),
            turnOnOffButton,
            responseTextArea
    );
    root.setAlignment(Pos.CENTER);

    primaryStage.setTitle("Smart Public Lighting Client");
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.show();
}

}