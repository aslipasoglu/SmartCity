// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartWasteManagementService.proto

package com.waste.service;

/**
 * Protobuf type {@code smart_power.GetCustomizedRouteResponse}
 */
public  final class GetCustomizedRouteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smart_power.GetCustomizedRouteResponse)
    GetCustomizedRouteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCustomizedRouteResponse.newBuilder() to construct.
  private GetCustomizedRouteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCustomizedRouteResponse() {
    optimizedRoute_ = "";
    binLevel1_ = 0;
    binLevel2_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCustomizedRouteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            optimizedRoute_ = s;
            break;
          }
          case 16: {

            binLevel1_ = input.readInt32();
            break;
          }
          case 24: {

            binLevel2_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.waste.service.GetCustomizedRouteResponse.class, com.waste.service.GetCustomizedRouteResponse.Builder.class);
  }

  public static final int OPTIMIZEDROUTE_FIELD_NUMBER = 1;
  private volatile java.lang.Object optimizedRoute_;
  /**
   * <code>string optimizedRoute = 1;</code>
   */
  public java.lang.String getOptimizedRoute() {
    java.lang.Object ref = optimizedRoute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      optimizedRoute_ = s;
      return s;
    }
  }
  /**
   * <code>string optimizedRoute = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOptimizedRouteBytes() {
    java.lang.Object ref = optimizedRoute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      optimizedRoute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BINLEVEL1_FIELD_NUMBER = 2;
  private int binLevel1_;
  /**
   * <code>int32 binLevel1 = 2;</code>
   */
  public int getBinLevel1() {
    return binLevel1_;
  }

  public static final int BINLEVEL2_FIELD_NUMBER = 3;
  private int binLevel2_;
  /**
   * <code>int32 binLevel2 = 3;</code>
   */
  public int getBinLevel2() {
    return binLevel2_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOptimizedRouteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, optimizedRoute_);
    }
    if (binLevel1_ != 0) {
      output.writeInt32(2, binLevel1_);
    }
    if (binLevel2_ != 0) {
      output.writeInt32(3, binLevel2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOptimizedRouteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, optimizedRoute_);
    }
    if (binLevel1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, binLevel1_);
    }
    if (binLevel2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, binLevel2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.waste.service.GetCustomizedRouteResponse)) {
      return super.equals(obj);
    }
    com.waste.service.GetCustomizedRouteResponse other = (com.waste.service.GetCustomizedRouteResponse) obj;

    boolean result = true;
    result = result && getOptimizedRoute()
        .equals(other.getOptimizedRoute());
    result = result && (getBinLevel1()
        == other.getBinLevel1());
    result = result && (getBinLevel2()
        == other.getBinLevel2());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPTIMIZEDROUTE_FIELD_NUMBER;
    hash = (53 * hash) + getOptimizedRoute().hashCode();
    hash = (37 * hash) + BINLEVEL1_FIELD_NUMBER;
    hash = (53 * hash) + getBinLevel1();
    hash = (37 * hash) + BINLEVEL2_FIELD_NUMBER;
    hash = (53 * hash) + getBinLevel2();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.waste.service.GetCustomizedRouteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code smart_power.GetCustomizedRouteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smart_power.GetCustomizedRouteResponse)
      com.waste.service.GetCustomizedRouteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.waste.service.GetCustomizedRouteResponse.class, com.waste.service.GetCustomizedRouteResponse.Builder.class);
    }

    // Construct using com.waste.service.GetCustomizedRouteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      optimizedRoute_ = "";

      binLevel1_ = 0;

      binLevel2_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteResponse_descriptor;
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteResponse getDefaultInstanceForType() {
      return com.waste.service.GetCustomizedRouteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteResponse build() {
      com.waste.service.GetCustomizedRouteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteResponse buildPartial() {
      com.waste.service.GetCustomizedRouteResponse result = new com.waste.service.GetCustomizedRouteResponse(this);
      result.optimizedRoute_ = optimizedRoute_;
      result.binLevel1_ = binLevel1_;
      result.binLevel2_ = binLevel2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.waste.service.GetCustomizedRouteResponse) {
        return mergeFrom((com.waste.service.GetCustomizedRouteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.waste.service.GetCustomizedRouteResponse other) {
      if (other == com.waste.service.GetCustomizedRouteResponse.getDefaultInstance()) return this;
      if (!other.getOptimizedRoute().isEmpty()) {
        optimizedRoute_ = other.optimizedRoute_;
        onChanged();
      }
      if (other.getBinLevel1() != 0) {
        setBinLevel1(other.getBinLevel1());
      }
      if (other.getBinLevel2() != 0) {
        setBinLevel2(other.getBinLevel2());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.waste.service.GetCustomizedRouteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.waste.service.GetCustomizedRouteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object optimizedRoute_ = "";
    /**
     * <code>string optimizedRoute = 1;</code>
     */
    public java.lang.String getOptimizedRoute() {
      java.lang.Object ref = optimizedRoute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        optimizedRoute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string optimizedRoute = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOptimizedRouteBytes() {
      java.lang.Object ref = optimizedRoute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        optimizedRoute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string optimizedRoute = 1;</code>
     */
    public Builder setOptimizedRoute(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      optimizedRoute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string optimizedRoute = 1;</code>
     */
    public Builder clearOptimizedRoute() {
      
      optimizedRoute_ = getDefaultInstance().getOptimizedRoute();
      onChanged();
      return this;
    }
    /**
     * <code>string optimizedRoute = 1;</code>
     */
    public Builder setOptimizedRouteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      optimizedRoute_ = value;
      onChanged();
      return this;
    }

    private int binLevel1_ ;
    /**
     * <code>int32 binLevel1 = 2;</code>
     */
    public int getBinLevel1() {
      return binLevel1_;
    }
    /**
     * <code>int32 binLevel1 = 2;</code>
     */
    public Builder setBinLevel1(int value) {
      
      binLevel1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 binLevel1 = 2;</code>
     */
    public Builder clearBinLevel1() {
      
      binLevel1_ = 0;
      onChanged();
      return this;
    }

    private int binLevel2_ ;
    /**
     * <code>int32 binLevel2 = 3;</code>
     */
    public int getBinLevel2() {
      return binLevel2_;
    }
    /**
     * <code>int32 binLevel2 = 3;</code>
     */
    public Builder setBinLevel2(int value) {
      
      binLevel2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 binLevel2 = 3;</code>
     */
    public Builder clearBinLevel2() {
      
      binLevel2_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smart_power.GetCustomizedRouteResponse)
  }

  // @@protoc_insertion_point(class_scope:smart_power.GetCustomizedRouteResponse)
  private static final com.waste.service.GetCustomizedRouteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.waste.service.GetCustomizedRouteResponse();
  }

  public static com.waste.service.GetCustomizedRouteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCustomizedRouteResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCustomizedRouteResponse>() {
    @java.lang.Override
    public GetCustomizedRouteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCustomizedRouteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCustomizedRouteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCustomizedRouteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.waste.service.GetCustomizedRouteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

