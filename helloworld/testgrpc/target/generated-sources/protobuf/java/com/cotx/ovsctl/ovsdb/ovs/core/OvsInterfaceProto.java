// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OvsInterface.proto

package com.cotx.ovsctl.ovsdb.ovs.core;

public final class OvsInterfaceProto {
  private OvsInterfaceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OvsInterface_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OvsInterface_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022OvsInterface.proto\032\022base_message.proto" +
      "\"x\n\014OvsInterface\022\014\n\004uuid\030\001 \001(\t\022\014\n\004name\030\002" +
      " \001(\t\022\023\n\004type\030\003 \001(\0162\005.Type\022\013\n\003mtu\030\004 \001(\003\022\032" +
      "\n\007options\030\005 \001(\0132\t.MapEntry\022\016\n\006ofport\030\006 \001" +
      "(\005*R\n\004Type\022\n\n\006SYSTEM\020\000\022\014\n\010INTERNAL\020\001\022\007\n\003" +
      "TAP\020\002\022\007\n\003GRE\020\003\022\t\n\005VXLAN\020\004\022\t\n\005PATCH\020\005\022\010\n\004" +
      "DPDK\020\006B;\n\036com.cotx.ovsctl.ovsdb.ovs.core" +
      "B\021OvsInterfaceProtoP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cotx.ovsctl.message.CommonMessageProto.getDescriptor(),
        }, assigner);
    internal_static_OvsInterface_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OvsInterface_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OvsInterface_descriptor,
        new java.lang.String[] { "Uuid", "Name", "Type", "Mtu", "Options", "Ofport", });
    com.cotx.ovsctl.message.CommonMessageProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
