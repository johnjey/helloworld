// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ovsdb/ovs/core/OvsController.proto

package com.cotx.ovsctl.ovsdb.ovs.core;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsControllerOrBuilder;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsControllerProto;

/**
 * <pre>
 *1. define OvsController message type.
 *2. AddControllerRequest's message item.
 *3. GetControllersResponse's message item.
 * </pre>
 *
 * Protobuf type {@code OvsController}
 */
public  final class OvsController extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OvsController)
        OvsControllerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OvsController.newBuilder() to construct.
  private OvsController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OvsController() {
    target_ = "";
    connectionMode_ = "";
    maxBackoff_ = 0L;
    inactivityProbe_ = 0L;
    enableAsyncMessages_ = false;
    controllerRateLimit_ = 0L;
    controllerBurstLimit_ = 0L;
    localIp_ = "";
    localNetMask_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OvsController(
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
            java.lang.String s = input.readStringRequireUtf8();

            target_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            connectionMode_ = s;
            break;
          }
          case 24: {

            maxBackoff_ = input.readInt64();
            break;
          }
          case 32: {

            inactivityProbe_ = input.readInt64();
            break;
          }
          case 40: {

            enableAsyncMessages_ = input.readBool();
            break;
          }
          case 48: {

            controllerRateLimit_ = input.readInt64();
            break;
          }
          case 56: {

            controllerBurstLimit_ = input.readInt64();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            localIp_ = s;
            break;
          }
          case 74: {
            java.lang.String s = input.readStringRequireUtf8();

            localNetMask_ = s;
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
    return OvsControllerProto.internal_static_OvsController_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return OvsControllerProto.internal_static_OvsController_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.class, com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private volatile java.lang.Object target_;
  /**
   * <code>string target = 1;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <code>string target = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTIONMODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object connectionMode_;
  /**
   * <code>string connectionMode = 2;</code>
   */
  public java.lang.String getConnectionMode() {
    java.lang.Object ref = connectionMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionMode_ = s;
      return s;
    }
  }
  /**
   * <code>string connectionMode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getConnectionModeBytes() {
    java.lang.Object ref = connectionMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectionMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXBACKOFF_FIELD_NUMBER = 3;
  private long maxBackoff_;
  /**
   * <code>int64 maxBackoff = 3;</code>
   */
  public long getMaxBackoff() {
    return maxBackoff_;
  }

  public static final int INACTIVITYPROBE_FIELD_NUMBER = 4;
  private long inactivityProbe_;
  /**
   * <code>int64 inactivityProbe = 4;</code>
   */
  public long getInactivityProbe() {
    return inactivityProbe_;
  }

  public static final int ENABLEASYNCMESSAGES_FIELD_NUMBER = 5;
  private boolean enableAsyncMessages_;
  /**
   * <code>bool enableAsyncMessages = 5;</code>
   */
  public boolean getEnableAsyncMessages() {
    return enableAsyncMessages_;
  }

  public static final int CONTROLLERRATELIMIT_FIELD_NUMBER = 6;
  private long controllerRateLimit_;
  /**
   * <code>int64 controllerRateLimit = 6;</code>
   */
  public long getControllerRateLimit() {
    return controllerRateLimit_;
  }

  public static final int CONTROLLERBURSTLIMIT_FIELD_NUMBER = 7;
  private long controllerBurstLimit_;
  /**
   * <code>int64 controllerBurstLimit = 7;</code>
   */
  public long getControllerBurstLimit() {
    return controllerBurstLimit_;
  }

  public static final int LOCALIP_FIELD_NUMBER = 8;
  private volatile java.lang.Object localIp_;
  /**
   * <code>string localIp = 8;</code>
   */
  public java.lang.String getLocalIp() {
    java.lang.Object ref = localIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localIp_ = s;
      return s;
    }
  }
  /**
   * <code>string localIp = 8;</code>
   */
  public com.google.protobuf.ByteString
      getLocalIpBytes() {
    java.lang.Object ref = localIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALNETMASK_FIELD_NUMBER = 9;
  private volatile java.lang.Object localNetMask_;
  /**
   * <code>string localNetMask = 9;</code>
   */
  public java.lang.String getLocalNetMask() {
    java.lang.Object ref = localNetMask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localNetMask_ = s;
      return s;
    }
  }
  /**
   * <code>string localNetMask = 9;</code>
   */
  public com.google.protobuf.ByteString
      getLocalNetMaskBytes() {
    java.lang.Object ref = localNetMask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localNetMask_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, target_);
    }
    if (!getConnectionModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, connectionMode_);
    }
    if (maxBackoff_ != 0L) {
      output.writeInt64(3, maxBackoff_);
    }
    if (inactivityProbe_ != 0L) {
      output.writeInt64(4, inactivityProbe_);
    }
    if (enableAsyncMessages_ != false) {
      output.writeBool(5, enableAsyncMessages_);
    }
    if (controllerRateLimit_ != 0L) {
      output.writeInt64(6, controllerRateLimit_);
    }
    if (controllerBurstLimit_ != 0L) {
      output.writeInt64(7, controllerBurstLimit_);
    }
    if (!getLocalIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, localIp_);
    }
    if (!getLocalNetMaskBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, localNetMask_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, target_);
    }
    if (!getConnectionModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, connectionMode_);
    }
    if (maxBackoff_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, maxBackoff_);
    }
    if (inactivityProbe_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, inactivityProbe_);
    }
    if (enableAsyncMessages_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, enableAsyncMessages_);
    }
    if (controllerRateLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, controllerRateLimit_);
    }
    if (controllerBurstLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, controllerBurstLimit_);
    }
    if (!getLocalIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, localIp_);
    }
    if (!getLocalNetMaskBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, localNetMask_);
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
    if (!(obj instanceof com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController)) {
      return super.equals(obj);
    }
    com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController other = (com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController) obj;

    boolean result = true;
    result = result && getTarget()
        .equals(other.getTarget());
    result = result && getConnectionMode()
        .equals(other.getConnectionMode());
    result = result && (getMaxBackoff()
        == other.getMaxBackoff());
    result = result && (getInactivityProbe()
        == other.getInactivityProbe());
    result = result && (getEnableAsyncMessages()
        == other.getEnableAsyncMessages());
    result = result && (getControllerRateLimit()
        == other.getControllerRateLimit());
    result = result && (getControllerBurstLimit()
        == other.getControllerBurstLimit());
    result = result && getLocalIp()
        .equals(other.getLocalIp());
    result = result && getLocalNetMask()
        .equals(other.getLocalNetMask());
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
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + CONNECTIONMODE_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionMode().hashCode();
    hash = (37 * hash) + MAXBACKOFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxBackoff());
    hash = (37 * hash) + INACTIVITYPROBE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInactivityProbe());
    hash = (37 * hash) + ENABLEASYNCMESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAsyncMessages());
    hash = (37 * hash) + CONTROLLERRATELIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getControllerRateLimit());
    hash = (37 * hash) + CONTROLLERBURSTLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getControllerBurstLimit());
    hash = (37 * hash) + LOCALIP_FIELD_NUMBER;
    hash = (53 * hash) + getLocalIp().hashCode();
    hash = (37 * hash) + LOCALNETMASK_FIELD_NUMBER;
    hash = (53 * hash) + getLocalNetMask().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parseFrom(
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
  public static Builder newBuilder(com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController prototype) {
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
   *1. define OvsController message type.
   *2. AddControllerRequest's message item.
   *3. GetControllersResponse's message item.
   * </pre>
   *
   * Protobuf type {@code OvsController}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OvsController)
          OvsControllerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OvsControllerProto.internal_static_OvsController_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OvsControllerProto.internal_static_OvsController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.class, com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.Builder.class);
    }

    // Construct using OvsController.newBuilder()
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
      target_ = "";

      connectionMode_ = "";

      maxBackoff_ = 0L;

      inactivityProbe_ = 0L;

      enableAsyncMessages_ = false;

      controllerRateLimit_ = 0L;

      controllerBurstLimit_ = 0L;

      localIp_ = "";

      localNetMask_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return OvsControllerProto.internal_static_OvsController_descriptor;
    }

    public com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController getDefaultInstanceForType() {
      return com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.getDefaultInstance();
    }

    public com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController build() {
      com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController buildPartial() {
      com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController result = new com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController(this);
      result.target_ = target_;
      result.connectionMode_ = connectionMode_;
      result.maxBackoff_ = maxBackoff_;
      result.inactivityProbe_ = inactivityProbe_;
      result.enableAsyncMessages_ = enableAsyncMessages_;
      result.controllerRateLimit_ = controllerRateLimit_;
      result.controllerBurstLimit_ = controllerBurstLimit_;
      result.localIp_ = localIp_;
      result.localNetMask_ = localNetMask_;
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
      if (other instanceof com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController) {
        return mergeFrom((com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController other) {
      if (other == com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController.getDefaultInstance()) return this;
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
      }
      if (!other.getConnectionMode().isEmpty()) {
        connectionMode_ = other.connectionMode_;
        onChanged();
      }
      if (other.getMaxBackoff() != 0L) {
        setMaxBackoff(other.getMaxBackoff());
      }
      if (other.getInactivityProbe() != 0L) {
        setInactivityProbe(other.getInactivityProbe());
      }
      if (other.getEnableAsyncMessages() != false) {
        setEnableAsyncMessages(other.getEnableAsyncMessages());
      }
      if (other.getControllerRateLimit() != 0L) {
        setControllerRateLimit(other.getControllerRateLimit());
      }
      if (other.getControllerBurstLimit() != 0L) {
        setControllerBurstLimit(other.getControllerBurstLimit());
      }
      if (!other.getLocalIp().isEmpty()) {
        localIp_ = other.localIp_;
        onChanged();
      }
      if (!other.getLocalNetMask().isEmpty()) {
        localNetMask_ = other.localNetMask_;
        onChanged();
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
      com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <code>string target = 1;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object connectionMode_ = "";
    /**
     * <code>string connectionMode = 2;</code>
     */
    public java.lang.String getConnectionMode() {
      java.lang.Object ref = connectionMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string connectionMode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getConnectionModeBytes() {
      java.lang.Object ref = connectionMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectionMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string connectionMode = 2;</code>
     */
    public Builder setConnectionMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      connectionMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string connectionMode = 2;</code>
     */
    public Builder clearConnectionMode() {
      
      connectionMode_ = getDefaultInstance().getConnectionMode();
      onChanged();
      return this;
    }
    /**
     * <code>string connectionMode = 2;</code>
     */
    public Builder setConnectionModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      connectionMode_ = value;
      onChanged();
      return this;
    }

    private long maxBackoff_ ;
    /**
     * <code>int64 maxBackoff = 3;</code>
     */
    public long getMaxBackoff() {
      return maxBackoff_;
    }
    /**
     * <code>int64 maxBackoff = 3;</code>
     */
    public Builder setMaxBackoff(long value) {
      
      maxBackoff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 maxBackoff = 3;</code>
     */
    public Builder clearMaxBackoff() {
      
      maxBackoff_ = 0L;
      onChanged();
      return this;
    }

    private long inactivityProbe_ ;
    /**
     * <code>int64 inactivityProbe = 4;</code>
     */
    public long getInactivityProbe() {
      return inactivityProbe_;
    }
    /**
     * <code>int64 inactivityProbe = 4;</code>
     */
    public Builder setInactivityProbe(long value) {
      
      inactivityProbe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 inactivityProbe = 4;</code>
     */
    public Builder clearInactivityProbe() {
      
      inactivityProbe_ = 0L;
      onChanged();
      return this;
    }

    private boolean enableAsyncMessages_ ;
    /**
     * <code>bool enableAsyncMessages = 5;</code>
     */
    public boolean getEnableAsyncMessages() {
      return enableAsyncMessages_;
    }
    /**
     * <code>bool enableAsyncMessages = 5;</code>
     */
    public Builder setEnableAsyncMessages(boolean value) {
      
      enableAsyncMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enableAsyncMessages = 5;</code>
     */
    public Builder clearEnableAsyncMessages() {
      
      enableAsyncMessages_ = false;
      onChanged();
      return this;
    }

    private long controllerRateLimit_ ;
    /**
     * <code>int64 controllerRateLimit = 6;</code>
     */
    public long getControllerRateLimit() {
      return controllerRateLimit_;
    }
    /**
     * <code>int64 controllerRateLimit = 6;</code>
     */
    public Builder setControllerRateLimit(long value) {
      
      controllerRateLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 controllerRateLimit = 6;</code>
     */
    public Builder clearControllerRateLimit() {
      
      controllerRateLimit_ = 0L;
      onChanged();
      return this;
    }

    private long controllerBurstLimit_ ;
    /**
     * <code>int64 controllerBurstLimit = 7;</code>
     */
    public long getControllerBurstLimit() {
      return controllerBurstLimit_;
    }
    /**
     * <code>int64 controllerBurstLimit = 7;</code>
     */
    public Builder setControllerBurstLimit(long value) {
      
      controllerBurstLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 controllerBurstLimit = 7;</code>
     */
    public Builder clearControllerBurstLimit() {
      
      controllerBurstLimit_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object localIp_ = "";
    /**
     * <code>string localIp = 8;</code>
     */
    public java.lang.String getLocalIp() {
      java.lang.Object ref = localIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string localIp = 8;</code>
     */
    public com.google.protobuf.ByteString
        getLocalIpBytes() {
      java.lang.Object ref = localIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string localIp = 8;</code>
     */
    public Builder setLocalIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string localIp = 8;</code>
     */
    public Builder clearLocalIp() {
      
      localIp_ = getDefaultInstance().getLocalIp();
      onChanged();
      return this;
    }
    /**
     * <code>string localIp = 8;</code>
     */
    public Builder setLocalIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localIp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object localNetMask_ = "";
    /**
     * <code>string localNetMask = 9;</code>
     */
    public java.lang.String getLocalNetMask() {
      java.lang.Object ref = localNetMask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localNetMask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string localNetMask = 9;</code>
     */
    public com.google.protobuf.ByteString
        getLocalNetMaskBytes() {
      java.lang.Object ref = localNetMask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localNetMask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string localNetMask = 9;</code>
     */
    public Builder setLocalNetMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localNetMask_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string localNetMask = 9;</code>
     */
    public Builder clearLocalNetMask() {
      
      localNetMask_ = getDefaultInstance().getLocalNetMask();
      onChanged();
      return this;
    }
    /**
     * <code>string localNetMask = 9;</code>
     */
    public Builder setLocalNetMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localNetMask_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:OvsController)
  }

  // @@protoc_insertion_point(class_scope:OvsController)
  private static final com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController();
  }

  public static com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController>
      PARSER = new com.google.protobuf.AbstractParser<com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController>() {
    public com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController> getParserForType() {
    return PARSER;
  }

  public com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

