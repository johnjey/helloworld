// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.grpc.examples.helloworld;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NiHao_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NiHao_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\"5\n\005NiHao\022\014\n\004name\030\001 \002(\t\022\r\n" +
      "\005email\030\002 \002(\t\022\017\n\003age\030\003 \002(\005:\00218B2\n\033io.grpc" +
      ".examples.helloworldB\013CommonProtoP\001\242\002\003HL" +
      "W"
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
    internal_static_NiHao_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NiHao_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NiHao_descriptor,
        new java.lang.String[] { "Name", "Email", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
