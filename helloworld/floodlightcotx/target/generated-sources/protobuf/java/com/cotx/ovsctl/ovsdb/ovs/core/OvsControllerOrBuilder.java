// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ovsdb/ovs/core/OvsController.proto

package com.cotx.ovsctl.ovsdb.ovs.core;

public interface OvsControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OvsController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string target = 1;</code>
   */
  java.lang.String getTarget();
  /**
   * <code>string target = 1;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <code>string connectionMode = 2;</code>
   */
  java.lang.String getConnectionMode();
  /**
   * <code>string connectionMode = 2;</code>
   */
  com.google.protobuf.ByteString
      getConnectionModeBytes();

  /**
   * <code>int64 maxBackoff = 3;</code>
   */
  long getMaxBackoff();

  /**
   * <code>int64 inactivityProbe = 4;</code>
   */
  long getInactivityProbe();

  /**
   * <code>bool enableAsyncMessages = 5;</code>
   */
  boolean getEnableAsyncMessages();

  /**
   * <code>int64 controllerRateLimit = 6;</code>
   */
  long getControllerRateLimit();

  /**
   * <code>int64 controllerBurstLimit = 7;</code>
   */
  long getControllerBurstLimit();

  /**
   * <code>string localIp = 8;</code>
   */
  java.lang.String getLocalIp();
  /**
   * <code>string localIp = 8;</code>
   */
  com.google.protobuf.ByteString
      getLocalIpBytes();

  /**
   * <code>string localNetMask = 9;</code>
   */
  java.lang.String getLocalNetMask();
  /**
   * <code>string localNetMask = 9;</code>
   */
  com.google.protobuf.ByteString
      getLocalNetMaskBytes();
}
