package ma.enset.stubs;

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
    comments = "Source: chat.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Message> getDiffuseMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "diffuseMessage",
      requestType = ma.enset.stubs.Chat.Message.class,
      responseType = ma.enset.stubs.Chat.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Message> getDiffuseMessageMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Message> getDiffuseMessageMethod;
    if ((getDiffuseMessageMethod = ChatServiceGrpc.getDiffuseMessageMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getDiffuseMessageMethod = ChatServiceGrpc.getDiffuseMessageMethod) == null) {
          ChatServiceGrpc.getDiffuseMessageMethod = getDiffuseMessageMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "diffuseMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("diffuseMessage"))
                  .build();
          }
        }
     }
     return getDiffuseMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Message> getDiffuseMessageBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "diffuseMessageBid",
      requestType = ma.enset.stubs.Chat.Message.class,
      responseType = ma.enset.stubs.Chat.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message,
      ma.enset.stubs.Chat.Message> getDiffuseMessageBidMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Message> getDiffuseMessageBidMethod;
    if ((getDiffuseMessageBidMethod = ChatServiceGrpc.getDiffuseMessageBidMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getDiffuseMessageBidMethod = ChatServiceGrpc.getDiffuseMessageBidMethod) == null) {
          ChatServiceGrpc.getDiffuseMessageBidMethod = getDiffuseMessageBidMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Message, ma.enset.stubs.Chat.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "diffuseMessageBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("diffuseMessageBid"))
                  .build();
          }
        }
     }
     return getDiffuseMessageBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo,
      ma.enset.stubs.Chat.MessageTo> getEnvoiyerToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "envoiyerTo",
      requestType = ma.enset.stubs.Chat.MessageTo.class,
      responseType = ma.enset.stubs.Chat.MessageTo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo,
      ma.enset.stubs.Chat.MessageTo> getEnvoiyerToMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo, ma.enset.stubs.Chat.MessageTo> getEnvoiyerToMethod;
    if ((getEnvoiyerToMethod = ChatServiceGrpc.getEnvoiyerToMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getEnvoiyerToMethod = ChatServiceGrpc.getEnvoiyerToMethod) == null) {
          ChatServiceGrpc.getEnvoiyerToMethod = getEnvoiyerToMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.MessageTo, ma.enset.stubs.Chat.MessageTo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "envoiyerTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.MessageTo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.MessageTo.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("envoiyerTo"))
                  .build();
          }
        }
     }
     return getEnvoiyerToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Nom,
      ma.enset.stubs.Chat.Message> getConnecterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connecter",
      requestType = ma.enset.stubs.Chat.Nom.class,
      responseType = ma.enset.stubs.Chat.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Nom,
      ma.enset.stubs.Chat.Message> getConnecterMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.Nom, ma.enset.stubs.Chat.Message> getConnecterMethod;
    if ((getConnecterMethod = ChatServiceGrpc.getConnecterMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getConnecterMethod = ChatServiceGrpc.getConnecterMethod) == null) {
          ChatServiceGrpc.getConnecterMethod = getConnecterMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.Nom, ma.enset.stubs.Chat.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "connecter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Nom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("connecter"))
                  .build();
          }
        }
     }
     return getConnecterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo,
      ma.enset.stubs.Chat.MessageTo> getConnecteBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connecteBid",
      requestType = ma.enset.stubs.Chat.MessageTo.class,
      responseType = ma.enset.stubs.Chat.MessageTo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo,
      ma.enset.stubs.Chat.MessageTo> getConnecteBidMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.MessageTo, ma.enset.stubs.Chat.MessageTo> getConnecteBidMethod;
    if ((getConnecteBidMethod = ChatServiceGrpc.getConnecteBidMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getConnecteBidMethod = ChatServiceGrpc.getConnecteBidMethod) == null) {
          ChatServiceGrpc.getConnecteBidMethod = getConnecteBidMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.MessageTo, ma.enset.stubs.Chat.MessageTo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "connecteBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.MessageTo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.MessageTo.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("connecteBid"))
                  .build();
          }
        }
     }
     return getConnecteBidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void diffuseMessage(ma.enset.stubs.Chat.Message request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getDiffuseMessageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> diffuseMessageBid(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      return asyncUnimplementedStreamingCall(getDiffuseMessageBidMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> envoiyerTo(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> responseObserver) {
      return asyncUnimplementedStreamingCall(getEnvoiyerToMethod(), responseObserver);
    }

    /**
     */
    public void connecter(ma.enset.stubs.Chat.Nom request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getConnecterMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> connecteBid(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> responseObserver) {
      return asyncUnimplementedStreamingCall(getConnecteBidMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDiffuseMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Message,
                ma.enset.stubs.Chat.Message>(
                  this, METHODID_DIFFUSE_MESSAGE)))
          .addMethod(
            getDiffuseMessageBidMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Message,
                ma.enset.stubs.Chat.Message>(
                  this, METHODID_DIFFUSE_MESSAGE_BID)))
          .addMethod(
            getEnvoiyerToMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.MessageTo,
                ma.enset.stubs.Chat.MessageTo>(
                  this, METHODID_ENVOIYER_TO)))
          .addMethod(
            getConnecterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.Nom,
                ma.enset.stubs.Chat.Message>(
                  this, METHODID_CONNECTER)))
          .addMethod(
            getConnecteBidMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.MessageTo,
                ma.enset.stubs.Chat.MessageTo>(
                  this, METHODID_CONNECTE_BID)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub> {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     */
    public void diffuseMessage(ma.enset.stubs.Chat.Message request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDiffuseMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> diffuseMessageBid(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDiffuseMessageBidMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> envoiyerTo(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getEnvoiyerToMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void connecter(ma.enset.stubs.Chat.Nom request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnecterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> connecteBid(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConnecteBidMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.stubs.Chat.Message diffuseMessage(ma.enset.stubs.Chat.Message request) {
      return blockingUnaryCall(
          getChannel(), getDiffuseMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.stubs.Chat.Message connecter(ma.enset.stubs.Chat.Nom request) {
      return blockingUnaryCall(
          getChannel(), getConnecterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.Chat.Message> diffuseMessage(
        ma.enset.stubs.Chat.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getDiffuseMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.Chat.Message> connecter(
        ma.enset.stubs.Chat.Nom request) {
      return futureUnaryCall(
          getChannel().newCall(getConnecterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DIFFUSE_MESSAGE = 0;
  private static final int METHODID_CONNECTER = 1;
  private static final int METHODID_DIFFUSE_MESSAGE_BID = 2;
  private static final int METHODID_ENVOIYER_TO = 3;
  private static final int METHODID_CONNECTE_BID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DIFFUSE_MESSAGE:
          serviceImpl.diffuseMessage((ma.enset.stubs.Chat.Message) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message>) responseObserver);
          break;
        case METHODID_CONNECTER:
          serviceImpl.connecter((ma.enset.stubs.Chat.Nom) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message>) responseObserver);
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
        case METHODID_DIFFUSE_MESSAGE_BID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.diffuseMessageBid(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.Message>) responseObserver);
        case METHODID_ENVOIYER_TO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.envoiyerTo(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo>) responseObserver);
        case METHODID_CONNECTE_BID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.connecteBid(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.MessageTo>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getDiffuseMessageMethod())
              .addMethod(getDiffuseMessageBidMethod())
              .addMethod(getEnvoiyerToMethod())
              .addMethod(getConnecterMethod())
              .addMethod(getConnecteBidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
