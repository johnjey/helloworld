// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/BridgeConfigService.proto

package com.cotx.ovsctl.service.bridgeconfig;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterface;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterfaceOrBuilder;

public interface GetInterfacesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BridgeConfig.GetInterfacesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .OvsInterface ovsInterface = 1;</code>
   */
  java.util.List<OvsInterface>
      getOvsInterfaceList();
  /**
   * <code>repeated .OvsInterface ovsInterface = 1;</code>
   */
  OvsInterface getOvsInterface(int index);
  /**
   * <code>repeated .OvsInterface ovsInterface = 1;</code>
   */
  int getOvsInterfaceCount();
  /**
   * <code>repeated .OvsInterface ovsInterface = 1;</code>
   */
  java.util.List<? extends OvsInterfaceOrBuilder>
      getOvsInterfaceOrBuilderList();
  /**
   * <code>repeated .OvsInterface ovsInterface = 1;</code>
   */
  OvsInterfaceOrBuilder getOvsInterfaceOrBuilder(
      int index);
}
