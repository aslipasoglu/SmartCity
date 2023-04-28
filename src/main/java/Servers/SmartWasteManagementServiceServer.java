package Servers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.waste.service.GetBinLocatorRequest;
import com.waste.service.GetBinLocatorResponse;
import com.waste.service.GetCustomizedRouteRequest;
import com.waste.service.GetCustomizedRouteResponse;
import com.waste.service.SmartWasteManagementServiceGrpc.SmartWasteManagementServiceImplBase;

import io.grpc.stub.StreamObserver;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class SmartWasteManagementServiceServer extends SmartWasteManagementServiceImplBase {
	
	
	public static void main(String[] args) {
		SmartWasteManagementServiceServer wasteServer = new SmartWasteManagementServiceServer();

		Properties prop = wasteServer.getProperties();
		
		wasteServer.registerService(prop);
		
		int port3 = Integer.valueOf( prop.getProperty("service_port") );// #.50051;
		
		try {
			Server server = ServerBuilder.forPort(port3).addService(wasteServer).build().start();
			System.out.println("WasteManagement Server started, listening on " + port3);

			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/waste.properties")) {

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
	public StreamObserver<GetCustomizedRouteRequest> getCustomizedRoute(
	        StreamObserver<GetCustomizedRouteResponse> responseObserver) {

	    return new StreamObserver<GetCustomizedRouteRequest>() {
	        private int binLevel1 = 0;
	        private int binLevel2 = 0;
	        private boolean isFirstRequest = true;

	        @Override
	        public void onNext(GetCustomizedRouteRequest request) {
	            if (isFirstRequest) {
	                binLevel1 = request.getBinLevel1();
	                isFirstRequest = false;
	            } else {
	                binLevel2 = request.getBinLevel1();
	            }
	        }

	        @Override
	        public void onError(Throwable t) {
	        }

	        @Override
	        public void onCompleted() {
	            // optimized route
	            String optimizedRoute;
	            if (binLevel1 > binLevel2) {
	                optimizedRoute = "Start from bin 1 and then move to bin 2";
	            } else if (binLevel1 < binLevel2) {
	                optimizedRoute = "Start from bin 2 and then move to bin 1";
	            } else {
	                optimizedRoute = "Route can start either way";
	            }

	            GetCustomizedRouteResponse response = GetCustomizedRouteResponse.newBuilder()
	                    .setOptimizedRoute(optimizedRoute)
	                    .setBinLevel1(binLevel1)
	                    .setBinLevel2(binLevel2)
	                    .build();

	            responseObserver.onNext(response);
	            responseObserver.onCompleted();
	        }
	    };
	}



	@Override
	public void getBinLocator(GetBinLocatorRequest request, StreamObserver<GetBinLocatorResponse> responseObserver) {
	    String currentLocation = request.getCurrentLocation();
	    String binLocation;

	    // get current location and return the bin location
	    if (currentLocation.equalsIgnoreCase("Dublin")) {
	        binLocation = "The closest bin is: Rathgar Recycling bin";
	    } else if (currentLocation.equalsIgnoreCase("Cork")) {
	        binLocation = "The closest bin is: Shandon Recycling bin";
	    } else {
	        // error handling
	        String errorMsg = "Invalid location: " + currentLocation;
	        Status status = Status.INVALID_ARGUMENT.withDescription(errorMsg);
	        responseObserver.onError(status.asRuntimeException());
	        return;
	    }

	    // the response
	    GetBinLocatorResponse response = GetBinLocatorResponse.newBuilder()
	            .setNearestRecyclingBin(binLocation)
	            .build();
	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}


}
