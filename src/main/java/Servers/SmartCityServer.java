package Servers;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.power.service.GetEnergyConsumptionRequest;
import com.power.service.GetEnergyConsumptionResponse;
import com.power.service.GetEnergyConsumptionResponse.Builder;
import com.power.service.GetTotalEnergyConsumptionRequest;
import com.power.service.GetTotalEnergyConsumptionResponse;
import com.power.service.SetMaxEnergyLimitRequest;
import com.power.service.SetMaxEnergyLimitResponse;
import com.power.service.SmartPowerServiceGrpc.SmartPowerServiceImplBase;

import io.grpc.stub.StreamObserver;
import io.grpc.Status;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartCityServer extends SmartPowerServiceImplBase {
	
	public static void main(String[] args) {
		SmartCityServer powerServer = new SmartCityServer();

		Properties prop = powerServer.getProperties();
		
		powerServer.registerService(prop);
		
		int port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(powerServer)
					.build()
					.start();

			System.out.println("SmartCity Server started, listening on " + port);

			server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
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
	public void getEnergyConsumption(GetEnergyConsumptionRequest request,
			StreamObserver<GetEnergyConsumptionResponse> responseObserver) {
		// TODO Auto-generated method stub
		
		int deviceId = request.getDeviceId();
		
		Builder reply = GetEnergyConsumptionResponse.newBuilder();
				
		if (deviceId == 1) {
		    reply.setEnergyConsumption(20);
		} else if (deviceId == 2) {
		    reply.setEnergyConsumption(50);
		} else if (deviceId == 3) {
		    reply.setEnergyConsumption(30);
		} else {
		   
		}
		
		responseObserver.onNext(reply.build());
	    responseObserver.onCompleted();
	}

	private int currentMaxEnergyLimit;

	@Override
	public void setMaxEnergyLimit(SetMaxEnergyLimitRequest request,
	        StreamObserver<SetMaxEnergyLimitResponse> responseObserver) {

	    int maxEnergyLimit = request.getMaxEnergyLimit();

	    
	    if (maxEnergyLimit < 0 || maxEnergyLimit > 100) {
	        // error message  
	        SetMaxEnergyLimitResponse reply = SetMaxEnergyLimitResponse.newBuilder()
	                .setMessage("Maximum energy limit must be between 0 and 100!")
	                .build();
	        responseObserver.onNext(reply);
	        responseObserver.onCompleted();
	        return;
	    }

	    
	    currentMaxEnergyLimit = maxEnergyLimit;

	    
	    SetMaxEnergyLimitResponse reply = SetMaxEnergyLimitResponse.newBuilder()
	            .setMessage("Maximum energy limit has been set to " + maxEnergyLimit)
	            .setCurrentMaxEnergyLimit(currentMaxEnergyLimit)
	            .build();
	    responseObserver.onNext(reply);
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    SetMaxEnergyLimitResponse reply2 = SetMaxEnergyLimitResponse.newBuilder()
	            .setMessage("Unnecessary devices are shut down the new limit is:  " + (maxEnergyLimit-20))
	            .setCurrentMaxEnergyLimit(currentMaxEnergyLimit-20)
	            .build();
	    responseObserver.onNext(reply2);
	    responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<GetTotalEnergyConsumptionRequest> getTotalEnergyConsumption(
			StreamObserver<GetTotalEnergyConsumptionResponse> responseObserver) {
		
		return new StreamObserver<GetTotalEnergyConsumptionRequest>() {
			int totalEnergy = 0;

	        @Override
	        public void onNext(GetTotalEnergyConsumptionRequest request) {
	    		int deviceId = request.getDeviceId();
	    		switch(deviceId) {
	    			case 1:
	    				totalEnergy += 10;
	    				break;
	    			case 2:
	    				totalEnergy += 20;
	    				break;
	    			case 3:
	    				totalEnergy += 30;
	    				break;
	    			default:
	    				responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("It is not a valid deviceId, please choose 1,2,3").asException());
	    				return;
	    		}
	        }

			@Override
			public void onError(Throwable t) {
				
				
			}

			@Override
			public void onCompleted() {
				GetTotalEnergyConsumptionResponse reply = GetTotalEnergyConsumptionResponse.newBuilder()
						.setMessage("The total energy is " + totalEnergy)
						.build();
				responseObserver.onNext(reply);
				responseObserver.onCompleted();
			}
	    };
	    
	  }
	

	}


