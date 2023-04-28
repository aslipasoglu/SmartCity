package com.waste.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartWasteManagementService.proto")
public final class SmartWasteManagementServiceGrpc {

  private SmartWasteManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "smart_power.SmartWasteManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.waste.service.GetCustomizedRouteRequest,
      com.waste.service.GetCustomizedRouteResponse> getGetCustomizedRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomizedRoute",
      requestType = com.waste.service.GetCustomizedRouteRequest.class,
      responseType = com.waste.service.GetCustomizedRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.waste.service.GetCustomizedRouteRequest,
      com.waste.service.GetCustomizedRouteResponse> getGetCustomizedRouteMethod() {
    io.grpc.MethodDescriptor<com.waste.service.GetCustomizedRouteRequest, com.waste.service.GetCustomizedRouteResponse> getGetCustomizedRouteMethod;
    if ((getGetCustomizedRouteMethod = SmartWasteManagementServiceGrpc.getGetCustomizedRouteMethod) == null) {
      synchronized (SmartWasteManagementServiceGrpc.class) {
        if ((getGetCustomizedRouteMethod = SmartWasteManagementServiceGrpc.getGetCustomizedRouteMethod) == null) {
          SmartWasteManagementServiceGrpc.getGetCustomizedRouteMethod = getGetCustomizedRouteMethod = 
              io.grpc.MethodDescriptor.<com.waste.service.GetCustomizedRouteRequest, com.waste.service.GetCustomizedRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartWasteManagementService", "GetCustomizedRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.waste.service.GetCustomizedRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.waste.service.GetCustomizedRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartWasteManagementServiceMethodDescriptorSupplier("GetCustomizedRoute"))
                  .build();
          }
        }
     }
     return getGetCustomizedRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.waste.service.GetBinLocatorRequest,
      com.waste.service.GetBinLocatorResponse> getGetBinLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBinLocator",
      requestType = com.waste.service.GetBinLocatorRequest.class,
      responseType = com.waste.service.GetBinLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.waste.service.GetBinLocatorRequest,
      com.waste.service.GetBinLocatorResponse> getGetBinLocatorMethod() {
    io.grpc.MethodDescriptor<com.waste.service.GetBinLocatorRequest, com.waste.service.GetBinLocatorResponse> getGetBinLocatorMethod;
    if ((getGetBinLocatorMethod = SmartWasteManagementServiceGrpc.getGetBinLocatorMethod) == null) {
      synchronized (SmartWasteManagementServiceGrpc.class) {
        if ((getGetBinLocatorMethod = SmartWasteManagementServiceGrpc.getGetBinLocatorMethod) == null) {
          SmartWasteManagementServiceGrpc.getGetBinLocatorMethod = getGetBinLocatorMethod = 
              io.grpc.MethodDescriptor.<com.waste.service.GetBinLocatorRequest, com.waste.service.GetBinLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartWasteManagementService", "GetBinLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.waste.service.GetBinLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.waste.service.GetBinLocatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartWasteManagementServiceMethodDescriptorSupplier("GetBinLocator"))
                  .build();
          }
        }
     }
     return getGetBinLocatorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartWasteManagementServiceStub newStub(io.grpc.Channel channel) {
    return new SmartWasteManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartWasteManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartWasteManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartWasteManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartWasteManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartWasteManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.waste.service.GetCustomizedRouteRequest> getCustomizedRoute(
        io.grpc.stub.StreamObserver<com.waste.service.GetCustomizedRouteResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetCustomizedRouteMethod(), responseObserver);
    }

    /**
     */
    public void getBinLocator(com.waste.service.GetBinLocatorRequest request,
        io.grpc.stub.StreamObserver<com.waste.service.GetBinLocatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBinLocatorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomizedRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.waste.service.GetCustomizedRouteRequest,
                com.waste.service.GetCustomizedRouteResponse>(
                  this, METHODID_GET_CUSTOMIZED_ROUTE)))
          .addMethod(
            getGetBinLocatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.waste.service.GetBinLocatorRequest,
                com.waste.service.GetBinLocatorResponse>(
                  this, METHODID_GET_BIN_LOCATOR)))
          .build();
    }
  }

  /**
   */
  public static final class SmartWasteManagementServiceStub extends io.grpc.stub.AbstractStub<SmartWasteManagementServiceStub> {
    private SmartWasteManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartWasteManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWasteManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartWasteManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.waste.service.GetCustomizedRouteRequest> getCustomizedRoute(
        io.grpc.stub.StreamObserver<com.waste.service.GetCustomizedRouteResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetCustomizedRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getBinLocator(com.waste.service.GetBinLocatorRequest request,
        io.grpc.stub.StreamObserver<com.waste.service.GetBinLocatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBinLocatorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartWasteManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartWasteManagementServiceBlockingStub> {
    private SmartWasteManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartWasteManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWasteManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartWasteManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.waste.service.GetBinLocatorResponse getBinLocator(com.waste.service.GetBinLocatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBinLocatorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartWasteManagementServiceFutureStub extends io.grpc.stub.AbstractStub<SmartWasteManagementServiceFutureStub> {
    private SmartWasteManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartWasteManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWasteManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartWasteManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.waste.service.GetBinLocatorResponse> getBinLocator(
        com.waste.service.GetBinLocatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBinLocatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BIN_LOCATOR = 0;
  private static final int METHODID_GET_CUSTOMIZED_ROUTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartWasteManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartWasteManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BIN_LOCATOR:
          serviceImpl.getBinLocator((com.waste.service.GetBinLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.waste.service.GetBinLocatorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMIZED_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getCustomizedRoute(
              (io.grpc.stub.StreamObserver<com.waste.service.GetCustomizedRouteResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartWasteManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartWasteManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.waste.service.SmartWasteManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartWasteManagementService");
    }
  }

  private static final class SmartWasteManagementServiceFileDescriptorSupplier
      extends SmartWasteManagementServiceBaseDescriptorSupplier {
    SmartWasteManagementServiceFileDescriptorSupplier() {}
  }

  private static final class SmartWasteManagementServiceMethodDescriptorSupplier
      extends SmartWasteManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartWasteManagementServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmartWasteManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartWasteManagementServiceFileDescriptorSupplier())
              .addMethod(getGetCustomizedRouteMethod())
              .addMethod(getGetBinLocatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
