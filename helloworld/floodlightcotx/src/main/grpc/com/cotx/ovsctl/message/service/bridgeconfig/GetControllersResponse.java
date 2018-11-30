// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/BridgeConfigService.proto

package com.cotx.ovsctl.message.service.bridgeconfig;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsControllerOrBuilder;

/**
 * <pre>
 *rpc getControllers's response message.
 * </pre>
 *
 * Protobuf type {@code BridgeConfig.GetControllersResponse}
 */
public  final class GetControllersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BridgeConfig.GetControllersResponse)
    GetControllersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetControllersResponse.newBuilder() to construct.
  private GetControllersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetControllersResponse() {
    ovsController_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetControllersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ovsController_ = new java.util.ArrayList<OvsController>();
              mutable_bitField0_ |= 0x00000001;
            }
            ovsController_.add(
                input.readMessage(OvsController.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ovsController_ = java.util.Collections.unmodifiableList(ovsController_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BridgeConfigProto.internal_static_BridgeConfig_GetControllersResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BridgeConfigProto.internal_static_BridgeConfig_GetControllersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetControllersResponse.class, Builder.class);
  }

  public static final int OVSCONTROLLER_FIELD_NUMBER = 1;
  private java.util.List<OvsController> ovsController_;
  /**
   * <code>repeated .OvsController ovsController = 1;</code>
   */
  public java.util.List<OvsController> getOvsControllerList() {
    return ovsController_;
  }
  /**
   * <code>repeated .OvsController ovsController = 1;</code>
   */
  public java.util.List<? extends OvsControllerOrBuilder>
      getOvsControllerOrBuilderList() {
    return ovsController_;
  }
  /**
   * <code>repeated .OvsController ovsController = 1;</code>
   */
  public int getOvsControllerCount() {
    return ovsController_.size();
  }
  /**
   * <code>repeated .OvsController ovsController = 1;</code>
   */
  public OvsController getOvsController(int index) {
    return ovsController_.get(index);
  }
  /**
   * <code>repeated .OvsController ovsController = 1;</code>
   */
  public OvsControllerOrBuilder getOvsControllerOrBuilder(
      int index) {
    return ovsController_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ovsController_.size(); i++) {
      output.writeMessage(1, ovsController_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ovsController_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ovsController_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GetControllersResponse)) {
      return super.equals(obj);
    }
    GetControllersResponse other = (GetControllersResponse) obj;

    boolean result = true;
    result = result && getOvsControllerList()
        .equals(other.getOvsControllerList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOvsControllerCount() > 0) {
      hash = (37 * hash) + OVSCONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getOvsControllerList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetControllersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetControllersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetControllersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetControllersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetControllersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetControllersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetControllersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetControllersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetControllersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetControllersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetControllersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetControllersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetControllersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *rpc getControllers's response message.
   * </pre>
   *
   * Protobuf type {@code BridgeConfig.GetControllersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BridgeConfig.GetControllersResponse)
          GetControllersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BridgeConfigProto.internal_static_BridgeConfig_GetControllersResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BridgeConfigProto.internal_static_BridgeConfig_GetControllersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetControllersResponse.class, Builder.class);
    }

    // Construct using GetControllersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOvsControllerFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (ovsControllerBuilder_ == null) {
        ovsController_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ovsControllerBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BridgeConfigProto.internal_static_BridgeConfig_GetControllersResponse_descriptor;
    }

    public GetControllersResponse getDefaultInstanceForType() {
      return GetControllersResponse.getDefaultInstance();
    }

    public GetControllersResponse build() {
      GetControllersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GetControllersResponse buildPartial() {
      GetControllersResponse result = new GetControllersResponse(this);
      int from_bitField0_ = bitField0_;
      if (ovsControllerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ovsController_ = java.util.Collections.unmodifiableList(ovsController_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ovsController_ = ovsController_;
      } else {
        result.ovsController_ = ovsControllerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetControllersResponse) {
        return mergeFrom((GetControllersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetControllersResponse other) {
      if (other == GetControllersResponse.getDefaultInstance()) return this;
      if (ovsControllerBuilder_ == null) {
        if (!other.ovsController_.isEmpty()) {
          if (ovsController_.isEmpty()) {
            ovsController_ = other.ovsController_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOvsControllerIsMutable();
            ovsController_.addAll(other.ovsController_);
          }
          onChanged();
        }
      } else {
        if (!other.ovsController_.isEmpty()) {
          if (ovsControllerBuilder_.isEmpty()) {
            ovsControllerBuilder_.dispose();
            ovsControllerBuilder_ = null;
            ovsController_ = other.ovsController_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ovsControllerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOvsControllerFieldBuilder() : null;
          } else {
            ovsControllerBuilder_.addAllMessages(other.ovsController_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GetControllersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetControllersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<OvsController> ovsController_ =
      java.util.Collections.emptyList();
    private void ensureOvsControllerIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ovsController_ = new java.util.ArrayList<OvsController>(ovsController_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            OvsController, OvsController.Builder, OvsControllerOrBuilder> ovsControllerBuilder_;

    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public java.util.List<OvsController> getOvsControllerList() {
      if (ovsControllerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ovsController_);
      } else {
        return ovsControllerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public int getOvsControllerCount() {
      if (ovsControllerBuilder_ == null) {
        return ovsController_.size();
      } else {
        return ovsControllerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public OvsController getOvsController(int index) {
      if (ovsControllerBuilder_ == null) {
        return ovsController_.get(index);
      } else {
        return ovsControllerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder setOvsController(
        int index, OvsController value) {
      if (ovsControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOvsControllerIsMutable();
        ovsController_.set(index, value);
        onChanged();
      } else {
        ovsControllerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder setOvsController(
        int index, OvsController.Builder builderForValue) {
      if (ovsControllerBuilder_ == null) {
        ensureOvsControllerIsMutable();
        ovsController_.set(index, builderForValue.build());
        onChanged();
      } else {
        ovsControllerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder addOvsController(OvsController value) {
      if (ovsControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOvsControllerIsMutable();
        ovsController_.add(value);
        onChanged();
      } else {
        ovsControllerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder addOvsController(
        int index, OvsController value) {
      if (ovsControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOvsControllerIsMutable();
        ovsController_.add(index, value);
        onChanged();
      } else {
        ovsControllerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder addOvsController(
        OvsController.Builder builderForValue) {
      if (ovsControllerBuilder_ == null) {
        ensureOvsControllerIsMutable();
        ovsController_.add(builderForValue.build());
        onChanged();
      } else {
        ovsControllerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder addOvsController(
        int index, OvsController.Builder builderForValue) {
      if (ovsControllerBuilder_ == null) {
        ensureOvsControllerIsMutable();
        ovsController_.add(index, builderForValue.build());
        onChanged();
      } else {
        ovsControllerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder addAllOvsController(
        Iterable<? extends OvsController> values) {
      if (ovsControllerBuilder_ == null) {
        ensureOvsControllerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ovsController_);
        onChanged();
      } else {
        ovsControllerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder clearOvsController() {
      if (ovsControllerBuilder_ == null) {
        ovsController_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ovsControllerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public Builder removeOvsController(int index) {
      if (ovsControllerBuilder_ == null) {
        ensureOvsControllerIsMutable();
        ovsController_.remove(index);
        onChanged();
      } else {
        ovsControllerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public OvsController.Builder getOvsControllerBuilder(
        int index) {
      return getOvsControllerFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public OvsControllerOrBuilder getOvsControllerOrBuilder(
        int index) {
      if (ovsControllerBuilder_ == null) {
        return ovsController_.get(index);  } else {
        return ovsControllerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public java.util.List<? extends OvsControllerOrBuilder>
         getOvsControllerOrBuilderList() {
      if (ovsControllerBuilder_ != null) {
        return ovsControllerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ovsController_);
      }
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public OvsController.Builder addOvsControllerBuilder() {
      return getOvsControllerFieldBuilder().addBuilder(
          OvsController.getDefaultInstance());
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public OvsController.Builder addOvsControllerBuilder(
        int index) {
      return getOvsControllerFieldBuilder().addBuilder(
          index, OvsController.getDefaultInstance());
    }
    /**
     * <code>repeated .OvsController ovsController = 1;</code>
     */
    public java.util.List<OvsController.Builder>
         getOvsControllerBuilderList() {
      return getOvsControllerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            OvsController, OvsController.Builder, OvsControllerOrBuilder>
        getOvsControllerFieldBuilder() {
      if (ovsControllerBuilder_ == null) {
        ovsControllerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                OvsController, OvsController.Builder, OvsControllerOrBuilder>(
                ovsController_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ovsController_ = null;
      }
      return ovsControllerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BridgeConfig.GetControllersResponse)
  }

  // @@protoc_insertion_point(class_scope:BridgeConfig.GetControllersResponse)
  private static final GetControllersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetControllersResponse();
  }

  public static GetControllersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetControllersResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetControllersResponse>() {
    public GetControllersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetControllersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetControllersResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetControllersResponse> getParserForType() {
    return PARSER;
  }

  public GetControllersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

