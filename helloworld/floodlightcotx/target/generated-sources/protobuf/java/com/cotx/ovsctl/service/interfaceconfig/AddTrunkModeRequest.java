// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/InterfaceConfigService.proto

package com.cotx.ovsctl.service.interfaceconfig;

import com.cotx.ovsctl.message.common.VlanId;
import com.cotx.ovsctl.message.common.VlanIdOrBuilder;
import com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequestOrBuilder;
import com.cotx.ovsctl.message.service.interfaceconfig.CommonField;
import com.cotx.ovsctl.message.service.interfaceconfig.CommonFieldOrBuilder;
import com.cotx.ovsctl.message.service.interfaceconfig.InterfaceConfigProto;

/**
 * <pre>
 *rpc addTrunkMode's request message.
 * </pre>
 *
 * Protobuf type {@code InterfaceConfig.AddTrunkModeRequest}
 */
public  final class AddTrunkModeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InterfaceConfig.AddTrunkModeRequest)
        AddTrunkModeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddTrunkModeRequest.newBuilder() to construct.
  private AddTrunkModeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddTrunkModeRequest() {
    vlanIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddTrunkModeRequest(
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
            CommonField.Builder subBuilder = null;
            if (intf_ != null) {
              subBuilder = intf_.toBuilder();
            }
            intf_ = input.readMessage(CommonField.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(intf_);
              intf_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              vlanIds_ = new java.util.ArrayList<VlanId>();
              mutable_bitField0_ |= 0x00000002;
            }
            vlanIds_.add(
                input.readMessage(VlanId.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        vlanIds_ = java.util.Collections.unmodifiableList(vlanIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return InterfaceConfigProto.internal_static_InterfaceConfig_AddTrunkModeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return InterfaceConfigProto.internal_static_InterfaceConfig_AddTrunkModeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.class, com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INTF_FIELD_NUMBER = 1;
  private CommonField intf_;
  /**
   * <code>.InterfaceConfig.CommonField intf = 1;</code>
   */
  public boolean hasIntf() {
    return intf_ != null;
  }
  /**
   * <code>.InterfaceConfig.CommonField intf = 1;</code>
   */
  public CommonField getIntf() {
    return intf_ == null ? CommonField.getDefaultInstance() : intf_;
  }
  /**
   * <code>.InterfaceConfig.CommonField intf = 1;</code>
   */
  public CommonFieldOrBuilder getIntfOrBuilder() {
    return getIntf();
  }

  public static final int VLANIDS_FIELD_NUMBER = 2;
  private java.util.List<VlanId> vlanIds_;
  /**
   * <code>repeated .VlanId vlanIds = 2;</code>
   */
  public java.util.List<VlanId> getVlanIdsList() {
    return vlanIds_;
  }
  /**
   * <code>repeated .VlanId vlanIds = 2;</code>
   */
  public java.util.List<? extends VlanIdOrBuilder>
      getVlanIdsOrBuilderList() {
    return vlanIds_;
  }
  /**
   * <code>repeated .VlanId vlanIds = 2;</code>
   */
  public int getVlanIdsCount() {
    return vlanIds_.size();
  }
  /**
   * <code>repeated .VlanId vlanIds = 2;</code>
   */
  public VlanId getVlanIds(int index) {
    return vlanIds_.get(index);
  }
  /**
   * <code>repeated .VlanId vlanIds = 2;</code>
   */
  public VlanIdOrBuilder getVlanIdsOrBuilder(
      int index) {
    return vlanIds_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getVlanIdsCount(); i++) {
      if (!getVlanIds(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (intf_ != null) {
      output.writeMessage(1, getIntf());
    }
    for (int i = 0; i < vlanIds_.size(); i++) {
      output.writeMessage(2, vlanIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIntf());
    }
    for (int i = 0; i < vlanIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, vlanIds_.get(i));
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
    if (!(obj instanceof com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest)) {
      return super.equals(obj);
    }
    com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest other = (com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest) obj;

    boolean result = true;
    result = result && (hasIntf() == other.hasIntf());
    if (hasIntf()) {
      result = result && getIntf()
          .equals(other.getIntf());
    }
    result = result && getVlanIdsList()
        .equals(other.getVlanIdsList());
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
    if (hasIntf()) {
      hash = (37 * hash) + INTF_FIELD_NUMBER;
      hash = (53 * hash) + getIntf().hashCode();
    }
    if (getVlanIdsCount() > 0) {
      hash = (37 * hash) + VLANIDS_FIELD_NUMBER;
      hash = (53 * hash) + getVlanIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parseFrom(
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
  public static Builder newBuilder(com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest prototype) {
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
   *rpc addTrunkMode's request message.
   * </pre>
   *
   * Protobuf type {@code InterfaceConfig.AddTrunkModeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InterfaceConfig.AddTrunkModeRequest)
          AddTrunkModeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return InterfaceConfigProto.internal_static_InterfaceConfig_AddTrunkModeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return InterfaceConfigProto.internal_static_InterfaceConfig_AddTrunkModeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.class, com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.Builder.class);
    }

    // Construct using AddTrunkModeRequest.newBuilder()
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
        getVlanIdsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (intfBuilder_ == null) {
        intf_ = null;
      } else {
        intf_ = null;
        intfBuilder_ = null;
      }
      if (vlanIdsBuilder_ == null) {
        vlanIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        vlanIdsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return InterfaceConfigProto.internal_static_InterfaceConfig_AddTrunkModeRequest_descriptor;
    }

    public com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest getDefaultInstanceForType() {
      return com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.getDefaultInstance();
    }

    public com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest build() {
      com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest buildPartial() {
      com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest result = new com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (intfBuilder_ == null) {
        result.intf_ = intf_;
      } else {
        result.intf_ = intfBuilder_.build();
      }
      if (vlanIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          vlanIds_ = java.util.Collections.unmodifiableList(vlanIds_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.vlanIds_ = vlanIds_;
      } else {
        result.vlanIds_ = vlanIdsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest) {
        return mergeFrom((com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest other) {
      if (other == com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest.getDefaultInstance()) return this;
      if (other.hasIntf()) {
        mergeIntf(other.getIntf());
      }
      if (vlanIdsBuilder_ == null) {
        if (!other.vlanIds_.isEmpty()) {
          if (vlanIds_.isEmpty()) {
            vlanIds_ = other.vlanIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVlanIdsIsMutable();
            vlanIds_.addAll(other.vlanIds_);
          }
          onChanged();
        }
      } else {
        if (!other.vlanIds_.isEmpty()) {
          if (vlanIdsBuilder_.isEmpty()) {
            vlanIdsBuilder_.dispose();
            vlanIdsBuilder_ = null;
            vlanIds_ = other.vlanIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
            vlanIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVlanIdsFieldBuilder() : null;
          } else {
            vlanIdsBuilder_.addAllMessages(other.vlanIds_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getVlanIdsCount(); i++) {
        if (!getVlanIds(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private CommonField intf_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            CommonField, CommonField.Builder, CommonFieldOrBuilder> intfBuilder_;
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public boolean hasIntf() {
      return intfBuilder_ != null || intf_ != null;
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public CommonField getIntf() {
      if (intfBuilder_ == null) {
        return intf_ == null ? CommonField.getDefaultInstance() : intf_;
      } else {
        return intfBuilder_.getMessage();
      }
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public Builder setIntf(CommonField value) {
      if (intfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        intf_ = value;
        onChanged();
      } else {
        intfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public Builder setIntf(
        CommonField.Builder builderForValue) {
      if (intfBuilder_ == null) {
        intf_ = builderForValue.build();
        onChanged();
      } else {
        intfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public Builder mergeIntf(CommonField value) {
      if (intfBuilder_ == null) {
        if (intf_ != null) {
          intf_ =
            CommonField.newBuilder(intf_).mergeFrom(value).buildPartial();
        } else {
          intf_ = value;
        }
        onChanged();
      } else {
        intfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public Builder clearIntf() {
      if (intfBuilder_ == null) {
        intf_ = null;
        onChanged();
      } else {
        intf_ = null;
        intfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public CommonField.Builder getIntfBuilder() {
      
      onChanged();
      return getIntfFieldBuilder().getBuilder();
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    public CommonFieldOrBuilder getIntfOrBuilder() {
      if (intfBuilder_ != null) {
        return intfBuilder_.getMessageOrBuilder();
      } else {
        return intf_ == null ?
            CommonField.getDefaultInstance() : intf_;
      }
    }
    /**
     * <code>.InterfaceConfig.CommonField intf = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            CommonField, CommonField.Builder, CommonFieldOrBuilder>
        getIntfFieldBuilder() {
      if (intfBuilder_ == null) {
        intfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                CommonField, CommonField.Builder, CommonFieldOrBuilder>(
                getIntf(),
                getParentForChildren(),
                isClean());
        intf_ = null;
      }
      return intfBuilder_;
    }

    private java.util.List<VlanId> vlanIds_ =
      java.util.Collections.emptyList();
    private void ensureVlanIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        vlanIds_ = new java.util.ArrayList<VlanId>(vlanIds_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            VlanId, VlanId.Builder, VlanIdOrBuilder> vlanIdsBuilder_;

    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public java.util.List<VlanId> getVlanIdsList() {
      if (vlanIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vlanIds_);
      } else {
        return vlanIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public int getVlanIdsCount() {
      if (vlanIdsBuilder_ == null) {
        return vlanIds_.size();
      } else {
        return vlanIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public VlanId getVlanIds(int index) {
      if (vlanIdsBuilder_ == null) {
        return vlanIds_.get(index);
      } else {
        return vlanIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder setVlanIds(
        int index, VlanId value) {
      if (vlanIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVlanIdsIsMutable();
        vlanIds_.set(index, value);
        onChanged();
      } else {
        vlanIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder setVlanIds(
        int index, VlanId.Builder builderForValue) {
      if (vlanIdsBuilder_ == null) {
        ensureVlanIdsIsMutable();
        vlanIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        vlanIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder addVlanIds(VlanId value) {
      if (vlanIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVlanIdsIsMutable();
        vlanIds_.add(value);
        onChanged();
      } else {
        vlanIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder addVlanIds(
        int index, VlanId value) {
      if (vlanIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVlanIdsIsMutable();
        vlanIds_.add(index, value);
        onChanged();
      } else {
        vlanIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder addVlanIds(
        VlanId.Builder builderForValue) {
      if (vlanIdsBuilder_ == null) {
        ensureVlanIdsIsMutable();
        vlanIds_.add(builderForValue.build());
        onChanged();
      } else {
        vlanIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder addVlanIds(
        int index, VlanId.Builder builderForValue) {
      if (vlanIdsBuilder_ == null) {
        ensureVlanIdsIsMutable();
        vlanIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        vlanIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder addAllVlanIds(
        java.lang.Iterable<? extends VlanId> values) {
      if (vlanIdsBuilder_ == null) {
        ensureVlanIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vlanIds_);
        onChanged();
      } else {
        vlanIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder clearVlanIds() {
      if (vlanIdsBuilder_ == null) {
        vlanIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        vlanIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public Builder removeVlanIds(int index) {
      if (vlanIdsBuilder_ == null) {
        ensureVlanIdsIsMutable();
        vlanIds_.remove(index);
        onChanged();
      } else {
        vlanIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public VlanId.Builder getVlanIdsBuilder(
        int index) {
      return getVlanIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public VlanIdOrBuilder getVlanIdsOrBuilder(
        int index) {
      if (vlanIdsBuilder_ == null) {
        return vlanIds_.get(index);  } else {
        return vlanIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public java.util.List<? extends VlanIdOrBuilder>
         getVlanIdsOrBuilderList() {
      if (vlanIdsBuilder_ != null) {
        return vlanIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vlanIds_);
      }
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public VlanId.Builder addVlanIdsBuilder() {
      return getVlanIdsFieldBuilder().addBuilder(
          VlanId.getDefaultInstance());
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public VlanId.Builder addVlanIdsBuilder(
        int index) {
      return getVlanIdsFieldBuilder().addBuilder(
          index, VlanId.getDefaultInstance());
    }
    /**
     * <code>repeated .VlanId vlanIds = 2;</code>
     */
    public java.util.List<VlanId.Builder>
         getVlanIdsBuilderList() {
      return getVlanIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            VlanId, VlanId.Builder, VlanIdOrBuilder>
        getVlanIdsFieldBuilder() {
      if (vlanIdsBuilder_ == null) {
        vlanIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                VlanId, VlanId.Builder, VlanIdOrBuilder>(
                vlanIds_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        vlanIds_ = null;
      }
      return vlanIdsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:InterfaceConfig.AddTrunkModeRequest)
  }

  // @@protoc_insertion_point(class_scope:InterfaceConfig.AddTrunkModeRequest)
  private static final com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest();
  }

  public static com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest>
      PARSER = new com.google.protobuf.AbstractParser<com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest>() {
    public com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest> getParserForType() {
    return PARSER;
  }

  public com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

