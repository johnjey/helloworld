// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/InterfaceConfigService.proto

package com.cotx.ovsctl.message.service.interfaceconfig;

import com.cotx.ovsctl.message.description.InterfaceDescription;
import com.cotx.ovsctl.message.description.InterfaceDescriptionOrBuilder;

public interface GetInterfacesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:InterfaceConfig.GetInterfacesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .InterfaceDescription interfaceDescription = 1;</code>
   */
  java.util.List<InterfaceDescription>
      getInterfaceDescriptionList();
  /**
   * <code>repeated .InterfaceDescription interfaceDescription = 1;</code>
   */
  InterfaceDescription getInterfaceDescription(int index);
  /**
   * <code>repeated .InterfaceDescription interfaceDescription = 1;</code>
   */
  int getInterfaceDescriptionCount();
  /**
   * <code>repeated .InterfaceDescription interfaceDescription = 1;</code>
   */
  java.util.List<? extends InterfaceDescriptionOrBuilder>
      getInterfaceDescriptionOrBuilderList();
  /**
   * <code>repeated .InterfaceDescription interfaceDescription = 1;</code>
   */
  InterfaceDescriptionOrBuilder getInterfaceDescriptionOrBuilder(
          int index);
}
