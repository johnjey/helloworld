// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/BridgeConfigService.proto

package com.cotx.ovsctl.service.bridgeconfig;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsPort;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsPortOrBuilder;

public interface AddPortRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BridgeConfig.AddPortRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bridgeDpid = 1;</code>
   */
  java.lang.String getBridgeDpid();
  /**
   * <code>string bridgeDpid = 1;</code>
   */
  com.google.protobuf.ByteString
      getBridgeDpidBytes();

  /**
   * <code>.OvsPort ovsPort = 2;</code>
   */
  boolean hasOvsPort();
  /**
   * <code>.OvsPort ovsPort = 2;</code>
   */
  OvsPort getOvsPort();
  /**
   * <code>.OvsPort ovsPort = 2;</code>
   */
  OvsPortOrBuilder getOvsPortOrBuilder();
}
