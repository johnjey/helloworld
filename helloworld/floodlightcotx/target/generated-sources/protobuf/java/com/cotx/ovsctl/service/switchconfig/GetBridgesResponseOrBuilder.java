// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/SwitchConfigService.proto

package com.cotx.ovsctl.service.switchconfig;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsBridge;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsBridgeOrBuilder;

public interface GetBridgesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetBridgesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .OvsBridge ovsBridge = 1;</code>
   */
  java.util.List<OvsBridge>
      getOvsBridgeList();
  /**
   * <code>repeated .OvsBridge ovsBridge = 1;</code>
   */
  OvsBridge getOvsBridge(int index);
  /**
   * <code>repeated .OvsBridge ovsBridge = 1;</code>
   */
  int getOvsBridgeCount();
  /**
   * <code>repeated .OvsBridge ovsBridge = 1;</code>
   */
  java.util.List<? extends OvsBridgeOrBuilder>
      getOvsBridgeOrBuilderList();
  /**
   * <code>repeated .OvsBridge ovsBridge = 1;</code>
   */
  OvsBridgeOrBuilder getOvsBridgeOrBuilder(
      int index);
}
