package br.com.sd.victor;

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
    comments = "Source: grpc_database.proto")
public final class GrpcDatabaseGrpc {

  private GrpcDatabaseGrpc() {}

  public static final String SERVICE_NAME = "grpcdatabase.GrpcDatabase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = br.com.sd.victor.Request.class,
      responseType = br.com.sd.victor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getSetMethod() {
    io.grpc.MethodDescriptor<br.com.sd.victor.Request, br.com.sd.victor.Response> getSetMethod;
    if ((getSetMethod = GrpcDatabaseGrpc.getSetMethod) == null) {
      synchronized (GrpcDatabaseGrpc.class) {
        if ((getSetMethod = GrpcDatabaseGrpc.getSetMethod) == null) {
          GrpcDatabaseGrpc.getSetMethod = getSetMethod = 
              io.grpc.MethodDescriptor.<br.com.sd.victor.Request, br.com.sd.victor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcdatabase.GrpcDatabase", "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new GrpcDatabaseMethodDescriptorSupplier("Set"))
                  .build();
          }
        }
     }
     return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = br.com.sd.victor.Request.class,
      responseType = br.com.sd.victor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getGetMethod() {
    io.grpc.MethodDescriptor<br.com.sd.victor.Request, br.com.sd.victor.Response> getGetMethod;
    if ((getGetMethod = GrpcDatabaseGrpc.getGetMethod) == null) {
      synchronized (GrpcDatabaseGrpc.class) {
        if ((getGetMethod = GrpcDatabaseGrpc.getGetMethod) == null) {
          GrpcDatabaseGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<br.com.sd.victor.Request, br.com.sd.victor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcdatabase.GrpcDatabase", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new GrpcDatabaseMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getDelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Del",
      requestType = br.com.sd.victor.Request.class,
      responseType = br.com.sd.victor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getDelMethod() {
    io.grpc.MethodDescriptor<br.com.sd.victor.Request, br.com.sd.victor.Response> getDelMethod;
    if ((getDelMethod = GrpcDatabaseGrpc.getDelMethod) == null) {
      synchronized (GrpcDatabaseGrpc.class) {
        if ((getDelMethod = GrpcDatabaseGrpc.getDelMethod) == null) {
          GrpcDatabaseGrpc.getDelMethod = getDelMethod = 
              io.grpc.MethodDescriptor.<br.com.sd.victor.Request, br.com.sd.victor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcdatabase.GrpcDatabase", "Del"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new GrpcDatabaseMethodDescriptorSupplier("Del"))
                  .build();
          }
        }
     }
     return getDelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestAndSet",
      requestType = br.com.sd.victor.Request.class,
      responseType = br.com.sd.victor.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.sd.victor.Request,
      br.com.sd.victor.Response> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<br.com.sd.victor.Request, br.com.sd.victor.Response> getTestAndSetMethod;
    if ((getTestAndSetMethod = GrpcDatabaseGrpc.getTestAndSetMethod) == null) {
      synchronized (GrpcDatabaseGrpc.class) {
        if ((getTestAndSetMethod = GrpcDatabaseGrpc.getTestAndSetMethod) == null) {
          GrpcDatabaseGrpc.getTestAndSetMethod = getTestAndSetMethod = 
              io.grpc.MethodDescriptor.<br.com.sd.victor.Request, br.com.sd.victor.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcdatabase.GrpcDatabase", "TestAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.sd.victor.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new GrpcDatabaseMethodDescriptorSupplier("TestAndSet"))
                  .build();
          }
        }
     }
     return getTestAndSetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcDatabaseStub newStub(io.grpc.Channel channel) {
    return new GrpcDatabaseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcDatabaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GrpcDatabaseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcDatabaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GrpcDatabaseFutureStub(channel);
  }

  /**
   */
  public static abstract class GrpcDatabaseImplBase implements io.grpc.BindableService {

    /**
     */
    public void set(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     */
    public void get(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void del(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDelMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.sd.victor.Request,
                br.com.sd.victor.Response>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.sd.victor.Request,
                br.com.sd.victor.Response>(
                  this, METHODID_GET)))
          .addMethod(
            getDelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.sd.victor.Request,
                br.com.sd.victor.Response>(
                  this, METHODID_DEL)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.sd.victor.Request,
                br.com.sd.victor.Response>(
                  this, METHODID_TEST_AND_SET)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcDatabaseStub extends io.grpc.stub.AbstractStub<GrpcDatabaseStub> {
    private GrpcDatabaseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcDatabaseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcDatabaseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcDatabaseStub(channel, callOptions);
    }

    /**
     */
    public void set(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void del(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(br.com.sd.victor.Request request,
        io.grpc.stub.StreamObserver<br.com.sd.victor.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcDatabaseBlockingStub extends io.grpc.stub.AbstractStub<GrpcDatabaseBlockingStub> {
    private GrpcDatabaseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcDatabaseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcDatabaseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcDatabaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.sd.victor.Response set(br.com.sd.victor.Request request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.sd.victor.Response get(br.com.sd.victor.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.sd.victor.Response del(br.com.sd.victor.Request request) {
      return blockingUnaryCall(
          getChannel(), getDelMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.sd.victor.Response testAndSet(br.com.sd.victor.Request request) {
      return blockingUnaryCall(
          getChannel(), getTestAndSetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcDatabaseFutureStub extends io.grpc.stub.AbstractStub<GrpcDatabaseFutureStub> {
    private GrpcDatabaseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcDatabaseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcDatabaseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcDatabaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.sd.victor.Response> set(
        br.com.sd.victor.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.sd.victor.Response> get(
        br.com.sd.victor.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.sd.victor.Response> del(
        br.com.sd.victor.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.sd.victor.Response> testAndSet(
        br.com.sd.victor.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DEL = 2;
  private static final int METHODID_TEST_AND_SET = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcDatabaseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcDatabaseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET:
          serviceImpl.set((br.com.sd.victor.Request) request,
              (io.grpc.stub.StreamObserver<br.com.sd.victor.Response>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((br.com.sd.victor.Request) request,
              (io.grpc.stub.StreamObserver<br.com.sd.victor.Response>) responseObserver);
          break;
        case METHODID_DEL:
          serviceImpl.del((br.com.sd.victor.Request) request,
              (io.grpc.stub.StreamObserver<br.com.sd.victor.Response>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((br.com.sd.victor.Request) request,
              (io.grpc.stub.StreamObserver<br.com.sd.victor.Response>) responseObserver);
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

  private static abstract class GrpcDatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcDatabaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.sd.victor.GrpcDatabaseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcDatabase");
    }
  }

  private static final class GrpcDatabaseFileDescriptorSupplier
      extends GrpcDatabaseBaseDescriptorSupplier {
    GrpcDatabaseFileDescriptorSupplier() {}
  }

  private static final class GrpcDatabaseMethodDescriptorSupplier
      extends GrpcDatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcDatabaseMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcDatabaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcDatabaseFileDescriptorSupplier())
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getDelMethod())
              .addMethod(getTestAndSetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
