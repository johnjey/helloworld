// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/ControllProtocolVersion.proto

package com.cotx.ovsctl.message.common;

public final class ControlProtocolVersionProto {
  private ControlProtocolVersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n$common/ControllProtocolVersion.proto*`" +
      "\n\026ControlProtocolVersion\022\n\n\006OF_1_0\020\000\022\n\n\006" +
      "OF_1_1\020\001\022\n\n\006OF_1_2\020\002\022\n\n\006OF_1_3\020\003\022\n\n\006OF_1" +
      "_4\020\004\022\n\n\006OF_1_5\020\005B=\n\026com.cotx.ovsctl.comm" +
      "onB\033ControlProtocolVersionProtoP\001\242\002\003HLWb" +
      "\006proto3"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
