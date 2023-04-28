package Servers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.lighting.service.AdjustLightingRequest;
import com.lighting.service.AdjustLightingResponse;
import com.lighting.service.SmartPublicLightingServiceGrpc.SmartPublicLightingServiceImplBase;
import com.lighting.service.TurnOnAndOffLightingRequest;
import com.lighting.service.TurnOnAndOffLightingResponse;

import io.grpc.stub.StreamObserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class PublicLightingServiceServer extends SmartPublicLightingServiceImplBase {
	
	public static void main(String[] args) {
		PublicLightingServiceServer greeterserver = new PublicLightingServiceServer();
		Properties prop = greeterserver.getProperties();
		greeterserver.registerService(prop);
		int port2 = Integer.valueOf( prop.getProperty("service_port") );// #.50051;


		Server server;
		try {
			server = ServerBuilder.forPort(port2).addService(greeterserver).build().start();
			System.out.println("Lighthing Server started, listening on " + port2);

			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/lighthing.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Power Service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	
	private  void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}


	@Override
	public void adjustLighting(AdjustLightingRequest request, StreamObserver<AdjustLightingResponse> responseObserver) {
		String lightLevel = request.getLightLevel();
		int time = request.getTime();
		String location = request.getLocation();
		AdjustLightingResponse adjustLightingResponse = AdjustLightingResponse.newBuilder()
				.setBrightness("Brightness has been set to " + lightLevel + " successfuly in "
								+ location + " at " + time + " oclock")
				.build();
		
		
			
		responseObserver.onNext(adjustLightingResponse);
		responseObserver.onCompleted();	
				
		
	}

	@Override
	public void turnOnAndOffLighting(TurnOnAndOffLightingRequest request,
	        StreamObserver<TurnOnAndOffLightingResponse> responseObserver) {
	    String location = request.getLocation();
	    
	    // Method 
	    boolean success = turnOnOrOffLighting(location, request.getIsOn());

	    if (success) {
	        // success message
	        String message = request.getIsOn() ? "The lighting in " + location + " has been turned on." :
	            "The lighting in " + location + " has been turned off.";
	        TurnOnAndOffLightingResponse response = TurnOnAndOffLightingResponse.newBuilder()
	            .setMessage(message).setStatusCode(1)
	            .build();
	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	    } else {
	        // an error message
	        String message = "Succesfully to turn " + (request.getIsOn() ? "on" : "off") + " the lighting in " + location + ".";
	        TurnOnAndOffLightingResponse response = TurnOnAndOffLightingResponse.newBuilder()
	            .setMessage(message).setStatusCode(0)
	            .build();
	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	    }
	}

	private boolean turnOnOrOffLighting(String location, boolean isOn) {
		return isOn;
	   
	    // Returns true if successful, false otherwise
	}


}
