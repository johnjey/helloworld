// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/SwitchConfigService.proto

package com.cotx.ovsctl.service.switchconfig;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsBridge;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsBridgeOrBuilder;

public interface AddBridgeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddBridgeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.OvsBridge bridge = 1;</code>
   */
  boolean hasBridge();
  /**
   * <code>.OvsBridge bridge = 1;</code>
   */
  OvsBridge getBridge();
  /**
   * <code>.OvsBridge bridge = 1;</code>
   */
  OvsBridgeOrBuilder getBridgeOrBuilder();
}
