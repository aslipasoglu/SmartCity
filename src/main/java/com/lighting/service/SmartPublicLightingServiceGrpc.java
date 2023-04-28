package com.lighting.service;

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
    comments = "Source: smartPublicLightingService.proto")
public final class SmartPublicLightingServiceGrpc {

  private SmartPublicLightingServiceGrpc() {}

  public static final String SERVICE_NAME = "smart_power.SmartPublicLightingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lighting.service.AdjustLightingRequest,
      com.lighting.service.AdjustLightingResponse> getAdjustLightingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustLighting",
      requestType = com.lighting.service.AdjustLightingRequest.class,
      responseType = com.lighting.service.AdjustLightingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lighting.service.AdjustLightingRequest,
      com.lighting.service.AdjustLightingResponse> getAdjustLightingMethod() {
    io.grpc.MethodDescriptor<com.lighting.service.AdjustLightingRequest, com.lighting.service.AdjustLightingResponse> getAdjustLightingMethod;
    if ((getAdjustLightingMethod = SmartPublicLightingServiceGrpc.getAdjustLightingMethod) == null) {
      synchronized (SmartPublicLightingServiceGrpc.class) {
        if ((getAdjustLightingMethod = SmartPublicLightingServiceGrpc.getAdjustLightingMethod) == null) {
          SmartPublicLightingServiceGrpc.getAdjustLightingMethod = getAdjustLightingMethod = 
              io.grpc.MethodDescriptor.<com.lighting.service.AdjustLightingRequest, com.lighting.service.AdjustLightingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartPublicLightingService", "AdjustLighting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lighting.service.AdjustLightingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lighting.service.AdjustLightingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPublicLightingServiceMethodDescriptorSupplier("AdjustLighting"))
                  .build();
          }
        }
     }
     return getAdjustLightingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lighting.service.TurnOnAndOffLightingRequest,
      com.lighting.service.TurnOnAndOffLightingResponse> getTurnOnAndOffLightingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnAndOffLighting",
      requestType = com.lighting.service.TurnOnAndOffLightingRequest.class,
      responseType = com.lighting.service.TurnOnAndOffLightingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lighting.service.TurnOnAndOffLightingRequest,
      com.lighting.service.TurnOnAndOffLightingResponse> getTurnOnAndOffLightingMethod() {
    io.grpc.MethodDescriptor<com.lighting.service.TurnOnAndOffLightingRequest, com.lighting.service.TurnOnAndOffLightingResponse> getTurnOnAndOffLightingMethod;
    if ((getTurnOnAndOffLightingMethod = SmartPublicLightingServiceGrpc.getTurnOnAndOffLightingMethod) == null) {
      synchronized (SmartPublicLightingServiceGrpc.class) {
        if ((getTurnOnAndOffLightingMethod = SmartPublicLightingServiceGrpc.getTurnOnAndOffLightingMethod) == null) {
          SmartPublicLightingServiceGrpc.getTurnOnAndOffLightingMethod = getTurnOnAndOffLightingMethod = 
              io.grpc.MethodDescriptor.<com.lighting.service.TurnOnAndOffLightingRequest, com.lighting.service.TurnOnAndOffLightingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartPublicLightingService", "TurnOnAndOffLighting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lighting.service.TurnOnAndOffLightingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lighting.service.TurnOnAndOffLightingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPublicLightingServiceMethodDescriptorSupplier("TurnOnAndOffLighting"))
                  .build();
          }
        }
     }
     return getTurnOnAndOffLightingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartPublicLightingServiceStub newStub(io.grpc.Channel channel) {
    return new SmartPublicLightingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartPublicLightingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartPublicLightingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartPublicLightingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartPublicLightingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartPublicLightingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void adjustLighting(com.lighting.service.AdjustLightingRequest request,
        io.grpc.stub.StreamObserver<com.lighting.service.AdjustLightingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustLightingMethod(), responseObserver);
    }

    /**
     */
    public void turnOnAndOffLighting(com.lighting.service.TurnOnAndOffLightingRequest request,
        io.grpc.stub.StreamObserver<com.lighting.service.TurnOnAndOffLightingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnAndOffLightingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdjustLightingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lighting.service.AdjustLightingRequest,
                com.lighting.service.AdjustLightingResponse>(
                  this, METHODID_ADJUST_LIGHTING)))
          .addMethod(
            getTurnOnAndOffLightingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.lighting.service.TurnOnAndOffLightingRequest,
                com.lighting.service.TurnOnAndOffLightingResponse>(
                  this, METHODID_TURN_ON_AND_OFF_LIGHTING)))
          .build();
    }
  }

  /**
   */
  public static final class SmartPublicLightingServiceStub extends io.grpc.stub.AbstractStub<SmartPublicLightingServiceStub> {
    private SmartPublicLightingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPublicLightingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPublicLightingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPublicLightingServiceStub(channel, callOptions);
    }

    /**
     */
    public void adjustLighting(com.lighting.service.AdjustLightingRequest request,
        io.grpc.stub.StreamObserver<com.lighting.service.AdjustLightingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdjustLightingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOnAndOffLighting(com.lighting.service.TurnOnAndOffLightingRequest request,
        io.grpc.stub.StreamObserver<com.lighting.service.TurnOnAndOffLightingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnAndOffLightingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartPublicLightingServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartPublicLightingServiceBlockingStub> {
    private SmartPublicLightingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPublicLightingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPublicLightingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPublicLightingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lighting.service.AdjustLightingResponse adjustLighting(com.lighting.service.AdjustLightingRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdjustLightingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lighting.service.TurnOnAndOffLightingResponse turnOnAndOffLighting(com.lighting.service.TurnOnAndOffLightingRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnAndOffLightingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartPublicLightingServiceFutureStub extends io.grpc.stub.AbstractStub<SmartPublicLightingServiceFutureStub> {
    private SmartPublicLightingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPublicLightingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPublicLightingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPublicLightingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lighting.service.AdjustLightingResponse> adjustLighting(
        com.lighting.service.AdjustLightingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdjustLightingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lighting.service.TurnOnAndOffLightingResponse> turnOnAndOffLighting(
        com.lighting.service.TurnOnAndOffLightingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnAndOffLightingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADJUST_LIGHTING = 0;
  private static final int METHODID_TURN_ON_AND_OFF_LIGHTING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartPublicLightingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartPublicLightingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADJUST_LIGHTING:
          serviceImpl.adjustLighting((com.lighting.service.AdjustLightingRequest) request,
              (io.grpc.stub.StreamObserver<com.lighting.service.AdjustLightingResponse>) responseObserver);
          break;
        case METHODID_TURN_ON_AND_OFF_LIGHTING:
          serviceImpl.turnOnAndOffLighting((com.lighting.service.TurnOnAndOffLightingRequest) request,
              (io.grpc.stub.StreamObserver<com.lighting.service.TurnOnAndOffLightingResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartPublicLightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartPublicLightingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lighting.service.SmartPublicLightingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartPublicLightingService");
    }
  }

  private static final class SmartPublicLightingServiceFileDescriptorSupplier
      extends SmartPublicLightingServiceBaseDescriptorSupplier {
    SmartPublicLightingServiceFileDescriptorSupplier() {}
  }

  private static final class SmartPublicLightingServiceMethodDescriptorSupplier
      extends SmartPublicLightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartPublicLightingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartPublicLightingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartPublicLightingServiceFileDescriptorSupplier())
              .addMethod(getAdjustLightingMethod())
              .addMethod(getTurnOnAndOffLightingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
