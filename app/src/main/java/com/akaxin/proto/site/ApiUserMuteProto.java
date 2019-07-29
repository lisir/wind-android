// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_user_mute.proto

package com.akaxin.proto.site;

public final class ApiUserMuteProto {
  private ApiUserMuteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiUserMuteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserMuteRequest)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiUserMuteRequest}
   */
  public  static final class ApiUserMuteRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiUserMuteRequest, ApiUserMuteRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiUserMuteRequest)
      ApiUserMuteRequestOrBuilder {
    private ApiUserMuteRequest() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiUserMuteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiUserMuteRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserMuteRequest)
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequestOrBuilder {
      // Construct using com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiUserMuteRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest other = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest) arg1;
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiUserMuteRequest)
    private static final com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiUserMuteRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiUserMuteRequest> PARSER;

    public static com.google.protobuf.Parser<ApiUserMuteRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiUserMuteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserMuteResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional bool mute = 1;</code>
     */
    boolean getMute();
  }
  /**
   * Protobuf type {@code site.ApiUserMuteResponse}
   */
  public  static final class ApiUserMuteResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiUserMuteResponse, ApiUserMuteResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiUserMuteResponse)
      ApiUserMuteResponseOrBuilder {
    private ApiUserMuteResponse() {
    }
    public static final int MUTE_FIELD_NUMBER = 1;
    private boolean mute_;
    /**
     * <code>optional bool mute = 1;</code>
     */
    public boolean getMute() {
      return mute_;
    }
    /**
     * <code>optional bool mute = 1;</code>
     */
    private void setMute(boolean value) {

      mute_ = value;
    }
    /**
     * <code>optional bool mute = 1;</code>
     */
    private void clearMute() {

      mute_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (mute_ != false) {
        output.writeBool(1, mute_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (mute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, mute_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiUserMuteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiUserMuteResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserMuteResponse)
        com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponseOrBuilder {
      // Construct using com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional bool mute = 1;</code>
       */
      public boolean getMute() {
        return instance.getMute();
      }
      /**
       * <code>optional bool mute = 1;</code>
       */
      public Builder setMute(boolean value) {
        copyOnWrite();
        instance.setMute(value);
        return this;
      }
      /**
       * <code>optional bool mute = 1;</code>
       */
      public Builder clearMute() {
        copyOnWrite();
        instance.clearMute();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiUserMuteResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse other = (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse) arg1;
          mute_ = visitor.visitBoolean(mute_ != false, mute_,
              other.mute_ != false, other.mute_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  mute_ = input.readBool();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiUserMuteResponse)
    private static final com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiUserMuteResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.akaxin.proto.site.ApiUserMuteProto.ApiUserMuteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiUserMuteResponse> PARSER;

    public static com.google.protobuf.Parser<ApiUserMuteResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}