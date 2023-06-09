// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartWasteManagementService.proto

package com.waste.service;

/**
 * Protobuf type {@code smart_power.GetCustomizedRouteRequest}
 */
public  final class GetCustomizedRouteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smart_power.GetCustomizedRouteRequest)
    GetCustomizedRouteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCustomizedRouteRequest.newBuilder() to construct.
  private GetCustomizedRouteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCustomizedRouteRequest() {
    binLevel1_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCustomizedRouteRequest(
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
          case 8: {

            binLevel1_ = input.readInt32();
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
    return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.waste.service.GetCustomizedRouteRequest.class, com.waste.service.GetCustomizedRouteRequest.Builder.class);
  }

  public static final int BINLEVEL1_FIELD_NUMBER = 1;
  private int binLevel1_;
  /**
   * <code>int32 binLevel1 = 1;</code>
   */
  public int getBinLevel1() {
    return binLevel1_;
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
    if (binLevel1_ != 0) {
      output.writeInt32(1, binLevel1_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (binLevel1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, binLevel1_);
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
    if (!(obj instanceof com.waste.service.GetCustomizedRouteRequest)) {
      return super.equals(obj);
    }
    com.waste.service.GetCustomizedRouteRequest other = (com.waste.service.GetCustomizedRouteRequest) obj;

    boolean result = true;
    result = result && (getBinLevel1()
        == other.getBinLevel1());
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
    hash = (37 * hash) + BINLEVEL1_FIELD_NUMBER;
    hash = (53 * hash) + getBinLevel1();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.waste.service.GetCustomizedRouteRequest parseFrom(
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
  public static Builder newBuilder(com.waste.service.GetCustomizedRouteRequest prototype) {
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
   * Protobuf type {@code smart_power.GetCustomizedRouteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smart_power.GetCustomizedRouteRequest)
      com.waste.service.GetCustomizedRouteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.waste.service.GetCustomizedRouteRequest.class, com.waste.service.GetCustomizedRouteRequest.Builder.class);
    }

    // Construct using com.waste.service.GetCustomizedRouteRequest.newBuilder()
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
      binLevel1_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.waste.service.SmartWasteManagementServiceImpl.internal_static_smart_power_GetCustomizedRouteRequest_descriptor;
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteRequest getDefaultInstanceForType() {
      return com.waste.service.GetCustomizedRouteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteRequest build() {
      com.waste.service.GetCustomizedRouteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.waste.service.GetCustomizedRouteRequest buildPartial() {
      com.waste.service.GetCustomizedRouteRequest result = new com.waste.service.GetCustomizedRouteRequest(this);
      result.binLevel1_ = binLevel1_;
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
      if (other instanceof com.waste.service.GetCustomizedRouteRequest) {
        return mergeFrom((com.waste.service.GetCustomizedRouteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.waste.service.GetCustomizedRouteRequest other) {
      if (other == com.waste.service.GetCustomizedRouteRequest.getDefaultInstance()) return this;
      if (other.getBinLevel1() != 0) {
        setBinLevel1(other.getBinLevel1());
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
      com.waste.service.GetCustomizedRouteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.waste.service.GetCustomizedRouteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int binLevel1_ ;
    /**
     * <code>int32 binLevel1 = 1;</code>
     */
    public int getBinLevel1() {
      return binLevel1_;
    }
    /**
     * <code>int32 binLevel1 = 1;</code>
     */
    public Builder setBinLevel1(int value) {
      
      binLevel1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 binLevel1 = 1;</code>
     */
    public Builder clearBinLevel1() {
      
      binLevel1_ = 0;
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


    // @@protoc_insertion_point(builder_scope:smart_power.GetCustomizedRouteRequest)
  }

  // @@protoc_insertion_point(class_scope:smart_power.GetCustomizedRouteRequest)
  private static final com.waste.service.GetCustomizedRouteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.waste.service.GetCustomizedRouteRequest();
  }

  public static com.waste.service.GetCustomizedRouteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCustomizedRouteRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCustomizedRouteRequest>() {
    @java.lang.Override
    public GetCustomizedRouteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCustomizedRouteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCustomizedRouteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCustomizedRouteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.waste.service.GetCustomizedRouteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

