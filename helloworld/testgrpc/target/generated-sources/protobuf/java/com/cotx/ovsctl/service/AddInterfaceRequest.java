// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BridgeConfigService.proto

package com.cotx.ovsctl.service;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterface;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterfaceOrBuilder;
import com.cotx.ovsctl.message.service.BridgeConfigProto;

/**
 * <pre>
 *rpc addInterface's request message.
 * </pre>
 *
 * Protobuf type {@code AddInterfaceRequest}
 */
public  final class AddInterfaceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddInterfaceRequest)
    AddInterfaceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddInterfaceRequest.newBuilder() to construct.
  private AddInterfaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddInterfaceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddInterfaceRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.cotx.ovsctl.service.PortRequest.Builder subBuilder = null;
            if (portRequest_ != null) {
              subBuilder = portRequest_.toBuilder();
            }
            portRequest_ = input.readMessage(com.cotx.ovsctl.service.PortRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(portRequest_);
              portRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            OvsInterface.Builder subBuilder = null;
            if (ovsInterface_ != null) {
              subBuilder = ovsInterface_.toBuilder();
            }
            ovsInterface_ = input.readMessage(OvsInterface.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ovsInterface_);
              ovsInterface_ = subBuilder.buildPartial();
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
    return BridgeConfigProto.internal_static_AddInterfaceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BridgeConfigProto.internal_static_AddInterfaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cotx.ovsctl.service.AddInterfaceRequest.class, com.cotx.ovsctl.service.AddInterfaceRequest.Builder.class);
  }

  public static final int PORTREQUEST_FIELD_NUMBER = 1;
  private com.cotx.ovsctl.service.PortRequest portRequest_;
  /**
   * <code>.PortRequest portRequest = 1;</code>
   */
  public boolean hasPortRequest() {
    return portRequest_ != null;
  }
  /**
   * <code>.PortRequest portRequest = 1;</code>
   */
  public com.cotx.ovsctl.service.PortRequest getPortRequest() {
    return portRequest_ == null ? com.cotx.ovsctl.service.PortRequest.getDefaultInstance() : portRequest_;
  }
  /**
   * <code>.PortRequest portRequest = 1;</code>
   */
  public com.cotx.ovsctl.service.PortRequestOrBuilder getPortRequestOrBuilder() {
    return getPortRequest();
  }

  public static final int OVSINTERFACE_FIELD_NUMBER = 2;
  private OvsInterface ovsInterface_;
  /**
   * <code>.OvsInterface ovsInterface = 2;</code>
   */
  public boolean hasOvsInterface() {
    return ovsInterface_ != null;
  }
  /**
   * <code>.OvsInterface ovsInterface = 2;</code>
   */
  public OvsInterface getOvsInterface() {
    return ovsInterface_ == null ? OvsInterface.getDefaultInstance() : ovsInterface_;
  }
  /**
   * <code>.OvsInterface ovsInterface = 2;</code>
   */
  public OvsInterfaceOrBuilder getOvsInterfaceOrBuilder() {
    return getOvsInterface();
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
    if (portRequest_ != null) {
      output.writeMessage(1, getPortRequest());
    }
    if (ovsInterface_ != null) {
      output.writeMessage(2, getOvsInterface());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (portRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPortRequest());
    }
    if (ovsInterface_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOvsInterface());
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
    if (!(obj instanceof com.cotx.ovsctl.service.AddInterfaceRequest)) {
      return super.equals(obj);
    }
    com.cotx.ovsctl.service.AddInterfaceRequest other = (com.cotx.ovsctl.service.AddInterfaceRequest) obj;

    boolean result = true;
    result = result && (hasPortRequest() == other.hasPortRequest());
    if (hasPortRequest()) {
      result = result && getPortRequest()
          .equals(other.getPortRequest());
    }
    result = result && (hasOvsInterface() == other.hasOvsInterface());
    if (hasOvsInterface()) {
      result = result && getOvsInterface()
          .equals(other.getOvsInterface());
    }
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
    if (hasPortRequest()) {
      hash = (37 * hash) + PORTREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getPortRequest().hashCode();
    }
    if (hasOvsInterface()) {
      hash = (37 * hash) + OVSINTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getOvsInterface().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.service.AddInterfaceRequest parseFrom(
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
  public static Builder newBuilder(com.cotx.ovsctl.service.AddInterfaceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   *rpc addInterface's request message.
   * </pre>
   *
   * Protobuf type {@code AddInterfaceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddInterfaceRequest)
      com.cotx.ovsctl.service.AddInterfaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BridgeConfigProto.internal_static_AddInterfaceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BridgeConfigProto.internal_static_AddInterfaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cotx.ovsctl.service.AddInterfaceRequest.class, com.cotx.ovsctl.service.AddInterfaceRequest.Builder.class);
    }

    // Construct using com.cotx.ovsctl.service.AddInterfaceRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (portRequestBuilder_ == null) {
        portRequest_ = null;
      } else {
        portRequest_ = null;
        portRequestBuilder_ = null;
      }
      if (ovsInterfaceBuilder_ == null) {
        ovsInterface_ = null;
      } else {
        ovsInterface_ = null;
        ovsInterfaceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BridgeConfigProto.internal_static_AddInterfaceRequest_descriptor;
    }

    public com.cotx.ovsctl.service.AddInterfaceRequest getDefaultInstanceForType() {
      return com.cotx.ovsctl.service.AddInterfaceRequest.getDefaultInstance();
    }

    public com.cotx.ovsctl.service.AddInterfaceRequest build() {
      com.cotx.ovsctl.service.AddInterfaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cotx.ovsctl.service.AddInterfaceRequest buildPartial() {
      com.cotx.ovsctl.service.AddInterfaceRequest result = new com.cotx.ovsctl.service.AddInterfaceRequest(this);
      if (portRequestBuilder_ == null) {
        result.portRequest_ = portRequest_;
      } else {
        result.portRequest_ = portRequestBuilder_.build();
      }
      if (ovsInterfaceBuilder_ == null) {
        result.ovsInterface_ = ovsInterface_;
      } else {
        result.ovsInterface_ = ovsInterfaceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cotx.ovsctl.service.AddInterfaceRequest) {
        return mergeFrom((com.cotx.ovsctl.service.AddInterfaceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cotx.ovsctl.service.AddInterfaceRequest other) {
      if (other == com.cotx.ovsctl.service.AddInterfaceRequest.getDefaultInstance()) return this;
      if (other.hasPortRequest()) {
        mergePortRequest(other.getPortRequest());
      }
      if (other.hasOvsInterface()) {
        mergeOvsInterface(other.getOvsInterface());
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
      com.cotx.ovsctl.service.AddInterfaceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cotx.ovsctl.service.AddInterfaceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cotx.ovsctl.service.PortRequest portRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.service.PortRequest.Builder, com.cotx.ovsctl.service.PortRequestOrBuilder> portRequestBuilder_;
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public boolean hasPortRequest() {
      return portRequestBuilder_ != null || portRequest_ != null;
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public com.cotx.ovsctl.service.PortRequest getPortRequest() {
      if (portRequestBuilder_ == null) {
        return portRequest_ == null ? com.cotx.ovsctl.service.PortRequest.getDefaultInstance() : portRequest_;
      } else {
        return portRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public Builder setPortRequest(com.cotx.ovsctl.service.PortRequest value) {
      if (portRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        portRequest_ = value;
        onChanged();
      } else {
        portRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public Builder setPortRequest(
        com.cotx.ovsctl.service.PortRequest.Builder builderForValue) {
      if (portRequestBuilder_ == null) {
        portRequest_ = builderForValue.build();
        onChanged();
      } else {
        portRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public Builder mergePortRequest(com.cotx.ovsctl.service.PortRequest value) {
      if (portRequestBuilder_ == null) {
        if (portRequest_ != null) {
          portRequest_ =
            com.cotx.ovsctl.service.PortRequest.newBuilder(portRequest_).mergeFrom(value).buildPartial();
        } else {
          portRequest_ = value;
        }
        onChanged();
      } else {
        portRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public Builder clearPortRequest() {
      if (portRequestBuilder_ == null) {
        portRequest_ = null;
        onChanged();
      } else {
        portRequest_ = null;
        portRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public com.cotx.ovsctl.service.PortRequest.Builder getPortRequestBuilder() {
      
      onChanged();
      return getPortRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    public com.cotx.ovsctl.service.PortRequestOrBuilder getPortRequestOrBuilder() {
      if (portRequestBuilder_ != null) {
        return portRequestBuilder_.getMessageOrBuilder();
      } else {
        return portRequest_ == null ?
            com.cotx.ovsctl.service.PortRequest.getDefaultInstance() : portRequest_;
      }
    }
    /**
     * <code>.PortRequest portRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.service.PortRequest.Builder, com.cotx.ovsctl.service.PortRequestOrBuilder> 
        getPortRequestFieldBuilder() {
      if (portRequestBuilder_ == null) {
        portRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.service.PortRequest.Builder, com.cotx.ovsctl.service.PortRequestOrBuilder>(
                getPortRequest(),
                getParentForChildren(),
                isClean());
        portRequest_ = null;
      }
      return portRequestBuilder_;
    }

    private OvsInterface ovsInterface_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            OvsInterface, OvsInterface.Builder, OvsInterfaceOrBuilder> ovsInterfaceBuilder_;
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public boolean hasOvsInterface() {
      return ovsInterfaceBuilder_ != null || ovsInterface_ != null;
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public OvsInterface getOvsInterface() {
      if (ovsInterfaceBuilder_ == null) {
        return ovsInterface_ == null ? OvsInterface.getDefaultInstance() : ovsInterface_;
      } else {
        return ovsInterfaceBuilder_.getMessage();
      }
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public Builder setOvsInterface(OvsInterface value) {
      if (ovsInterfaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ovsInterface_ = value;
        onChanged();
      } else {
        ovsInterfaceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public Builder setOvsInterface(
        OvsInterface.Builder builderForValue) {
      if (ovsInterfaceBuilder_ == null) {
        ovsInterface_ = builderForValue.build();
        onChanged();
      } else {
        ovsInterfaceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public Builder mergeOvsInterface(OvsInterface value) {
      if (ovsInterfaceBuilder_ == null) {
        if (ovsInterface_ != null) {
          ovsInterface_ =
            OvsInterface.newBuilder(ovsInterface_).mergeFrom(value).buildPartial();
        } else {
          ovsInterface_ = value;
        }
        onChanged();
      } else {
        ovsInterfaceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public Builder clearOvsInterface() {
      if (ovsInterfaceBuilder_ == null) {
        ovsInterface_ = null;
        onChanged();
      } else {
        ovsInterface_ = null;
        ovsInterfaceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public OvsInterface.Builder getOvsInterfaceBuilder() {
      
      onChanged();
      return getOvsInterfaceFieldBuilder().getBuilder();
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    public OvsInterfaceOrBuilder getOvsInterfaceOrBuilder() {
      if (ovsInterfaceBuilder_ != null) {
        return ovsInterfaceBuilder_.getMessageOrBuilder();
      } else {
        return ovsInterface_ == null ?
            OvsInterface.getDefaultInstance() : ovsInterface_;
      }
    }
    /**
     * <code>.OvsInterface ovsInterface = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            OvsInterface, OvsInterface.Builder, OvsInterfaceOrBuilder>
        getOvsInterfaceFieldBuilder() {
      if (ovsInterfaceBuilder_ == null) {
        ovsInterfaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                OvsInterface, OvsInterface.Builder, OvsInterfaceOrBuilder>(
                getOvsInterface(),
                getParentForChildren(),
                isClean());
        ovsInterface_ = null;
      }
      return ovsInterfaceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AddInterfaceRequest)
  }

  // @@protoc_insertion_point(class_scope:AddInterfaceRequest)
  private static final com.cotx.ovsctl.service.AddInterfaceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cotx.ovsctl.service.AddInterfaceRequest();
  }

  public static com.cotx.ovsctl.service.AddInterfaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddInterfaceRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddInterfaceRequest>() {
    public AddInterfaceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddInterfaceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddInterfaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddInterfaceRequest> getParserForType() {
    return PARSER;
  }

  public com.cotx.ovsctl.service.AddInterfaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

