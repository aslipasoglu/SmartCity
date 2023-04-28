package com.power.service;

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
 * <pre>
 * Service Definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartPowerService.proto")
public final class SmartPowerServiceGrpc {

  private SmartPowerServiceGrpc() {}

  public static final String SERVICE_NAME = "smart_power.SmartPowerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.power.service.GetEnergyConsumptionRequest,
      com.power.service.GetEnergyConsumptionResponse> getGetEnergyConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEnergyConsumption",
      requestType = com.power.service.GetEnergyConsumptionRequest.class,
      responseType = com.power.service.GetEnergyConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.power.service.GetEnergyConsumptionRequest,
      com.power.service.GetEnergyConsumptionResponse> getGetEnergyConsumptionMethod() {
    io.grpc.MethodDescriptor<com.power.service.GetEnergyConsumptionRequest, com.power.service.GetEnergyConsumptionResponse> getGetEnergyConsumptionMethod;
    if ((getGetEnergyConsumptionMethod = SmartPowerServiceGrpc.getGetEnergyConsumptionMethod) == null) {
      synchronized (SmartPowerServiceGrpc.class) {
        if ((getGetEnergyConsumptionMethod = SmartPowerServiceGrpc.getGetEnergyConsumptionMethod) == null) {
          SmartPowerServiceGrpc.getGetEnergyConsumptionMethod = getGetEnergyConsumptionMethod = 
              io.grpc.MethodDescriptor.<com.power.service.GetEnergyConsumptionRequest, com.power.service.GetEnergyConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartPowerService", "getEnergyConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.GetEnergyConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.GetEnergyConsumptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPowerServiceMethodDescriptorSupplier("getEnergyConsumption"))
                  .build();
          }
        }
     }
     return getGetEnergyConsumptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.power.service.SetMaxEnergyLimitRequest,
      com.power.service.SetMaxEnergyLimitResponse> getSetMaxEnergyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setMaxEnergyLimit",
      requestType = com.power.service.SetMaxEnergyLimitRequest.class,
      responseType = com.power.service.SetMaxEnergyLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.power.service.SetMaxEnergyLimitRequest,
      com.power.service.SetMaxEnergyLimitResponse> getSetMaxEnergyLimitMethod() {
    io.grpc.MethodDescriptor<com.power.service.SetMaxEnergyLimitRequest, com.power.service.SetMaxEnergyLimitResponse> getSetMaxEnergyLimitMethod;
    if ((getSetMaxEnergyLimitMethod = SmartPowerServiceGrpc.getSetMaxEnergyLimitMethod) == null) {
      synchronized (SmartPowerServiceGrpc.class) {
        if ((getSetMaxEnergyLimitMethod = SmartPowerServiceGrpc.getSetMaxEnergyLimitMethod) == null) {
          SmartPowerServiceGrpc.getSetMaxEnergyLimitMethod = getSetMaxEnergyLimitMethod = 
              io.grpc.MethodDescriptor.<com.power.service.SetMaxEnergyLimitRequest, com.power.service.SetMaxEnergyLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartPowerService", "setMaxEnergyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.SetMaxEnergyLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.SetMaxEnergyLimitResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPowerServiceMethodDescriptorSupplier("setMaxEnergyLimit"))
                  .build();
          }
        }
     }
     return getSetMaxEnergyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.power.service.GetTotalEnergyConsumptionRequest,
      com.power.service.GetTotalEnergyConsumptionResponse> getGetTotalEnergyConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalEnergyConsumption",
      requestType = com.power.service.GetTotalEnergyConsumptionRequest.class,
      responseType = com.power.service.GetTotalEnergyConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.power.service.GetTotalEnergyConsumptionRequest,
      com.power.service.GetTotalEnergyConsumptionResponse> getGetTotalEnergyConsumptionMethod() {
    io.grpc.MethodDescriptor<com.power.service.GetTotalEnergyConsumptionRequest, com.power.service.GetTotalEnergyConsumptionResponse> getGetTotalEnergyConsumptionMethod;
    if ((getGetTotalEnergyConsumptionMethod = SmartPowerServiceGrpc.getGetTotalEnergyConsumptionMethod) == null) {
      synchronized (SmartPowerServiceGrpc.class) {
        if ((getGetTotalEnergyConsumptionMethod = SmartPowerServiceGrpc.getGetTotalEnergyConsumptionMethod) == null) {
          SmartPowerServiceGrpc.getGetTotalEnergyConsumptionMethod = getGetTotalEnergyConsumptionMethod = 
              io.grpc.MethodDescriptor.<com.power.service.GetTotalEnergyConsumptionRequest, com.power.service.GetTotalEnergyConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smart_power.SmartPowerService", "GetTotalEnergyConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.GetTotalEnergyConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.power.service.GetTotalEnergyConsumptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPowerServiceMethodDescriptorSupplier("GetTotalEnergyConsumption"))
                  .build();
          }
        }
     }
     return getGetTotalEnergyConsumptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartPowerServiceStub newStub(io.grpc.Channel channel) {
    return new SmartPowerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartPowerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartPowerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartPowerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartPowerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static abstract class SmartPowerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEnergyConsumption(com.power.service.GetEnergyConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.power.service.GetEnergyConsumptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEnergyConsumptionMethod(), responseObserver);
    }

    /**
     */
    public void setMaxEnergyLimit(com.power.service.SetMaxEnergyLimitRequest request,
        io.grpc.stub.StreamObserver<com.power.service.SetMaxEnergyLimitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMaxEnergyLimitMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.power.service.GetTotalEnergyConsumptionRequest> getTotalEnergyConsumption(
        io.grpc.stub.StreamObserver<com.power.service.GetTotalEnergyConsumptionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetTotalEnergyConsumptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEnergyConsumptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.power.service.GetEnergyConsumptionRequest,
                com.power.service.GetEnergyConsumptionResponse>(
                  this, METHODID_GET_ENERGY_CONSUMPTION)))
          .addMethod(
            getSetMaxEnergyLimitMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.power.service.SetMaxEnergyLimitRequest,
                com.power.service.SetMaxEnergyLimitResponse>(
                  this, METHODID_SET_MAX_ENERGY_LIMIT)))
          .addMethod(
            getGetTotalEnergyConsumptionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.power.service.GetTotalEnergyConsumptionRequest,
                com.power.service.GetTotalEnergyConsumptionResponse>(
                  this, METHODID_GET_TOTAL_ENERGY_CONSUMPTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class SmartPowerServiceStub extends io.grpc.stub.AbstractStub<SmartPowerServiceStub> {
    private SmartPowerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPowerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPowerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPowerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEnergyConsumption(com.power.service.GetEnergyConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.power.service.GetEnergyConsumptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEnergyConsumptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxEnergyLimit(com.power.service.SetMaxEnergyLimitRequest request,
        io.grpc.stub.StreamObserver<com.power.service.SetMaxEnergyLimitResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSetMaxEnergyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.power.service.GetTotalEnergyConsumptionRequest> getTotalEnergyConsumption(
        io.grpc.stub.StreamObserver<com.power.service.GetTotalEnergyConsumptionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetTotalEnergyConsumptionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class SmartPowerServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartPowerServiceBlockingStub> {
    private SmartPowerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPowerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPowerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPowerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.power.service.GetEnergyConsumptionResponse getEnergyConsumption(com.power.service.GetEnergyConsumptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEnergyConsumptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.power.service.SetMaxEnergyLimitResponse> setMaxEnergyLimit(
        com.power.service.SetMaxEnergyLimitRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSetMaxEnergyLimitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class SmartPowerServiceFutureStub extends io.grpc.stub.AbstractStub<SmartPowerServiceFutureStub> {
    private SmartPowerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPowerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPowerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPowerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.power.service.GetEnergyConsumptionResponse> getEnergyConsumption(
        com.power.service.GetEnergyConsumptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEnergyConsumptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENERGY_CONSUMPTION = 0;
  private static final int METHODID_SET_MAX_ENERGY_LIMIT = 1;
  private static final int METHODID_GET_TOTAL_ENERGY_CONSUMPTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartPowerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartPowerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ENERGY_CONSUMPTION:
          serviceImpl.getEnergyConsumption((com.power.service.GetEnergyConsumptionRequest) request,
              (io.grpc.stub.StreamObserver<com.power.service.GetEnergyConsumptionResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_ENERGY_LIMIT:
          serviceImpl.setMaxEnergyLimit((com.power.service.SetMaxEnergyLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.power.service.SetMaxEnergyLimitResponse>) responseObserver);
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
        case METHODID_GET_TOTAL_ENERGY_CONSUMPTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTotalEnergyConsumption(
              (io.grpc.stub.StreamObserver<com.power.service.GetTotalEnergyConsumptionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartPowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartPowerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.power.service.SmartPowerServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartPowerService");
    }
  }

  private static final class SmartPowerServiceFileDescriptorSupplier
      extends SmartPowerServiceBaseDescriptorSupplier {
    SmartPowerServiceFileDescriptorSupplier() {}
  }

  private static final class SmartPowerServiceMethodDescriptorSupplier
      extends SmartPowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartPowerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartPowerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartPowerServiceFileDescriptorSupplier())
              .addMethod(getGetEnergyConsumptionMethod())
              .addMethod(getSetMaxEnergyLimitMethod())
              .addMethod(getGetTotalEnergyConsumptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
