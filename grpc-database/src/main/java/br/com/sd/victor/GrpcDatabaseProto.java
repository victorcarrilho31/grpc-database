// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_database.proto

package br.com.sd.victor;

public final class GrpcDatabaseProto {
  private GrpcDatabaseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdatabase_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdatabase_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdatabase_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdatabase_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdatabase_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdatabase_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023grpc_database.proto\022\014grpcdatabase\032\037goo" +
      "gle/protobuf/timestamp.proto\"S\n\007Request\022" +
      "\013\n\003key\030\001 \001(\004\022\"\n\005value\030\002 \001(\0132\023.grpcdataba" +
      "se.Value\022\027\n\017checkingVersion\030\003 \001(\004\"\233\001\n\010Re" +
      "sponse\022-\n\006result\030\001 \001(\0162\035.grpcdatabase.Re" +
      "sponse.Result\022\"\n\005value\030\002 \001(\0132\023.grpcdatab" +
      "ase.Value\"<\n\006Result\022\013\n\007SUCCESS\020\000\022\t\n\005ERRO" +
      "R\020\001\022\014\n\010ERROR_NE\020\002\022\014\n\010ERROR_WV\020\003\"9\n\005Value" +
      "\022\017\n\007version\030\001 \001(\004\022\021\n\ttimestamp\030\002 \001(\004\022\014\n\004" +
      "data\030\003 \001(\0142\355\001\n\014GrpcDatabase\0224\n\003Set\022\025.grp" +
      "cdatabase.Request\032\026.grpcdatabase.Respons" +
      "e\0224\n\003Get\022\025.grpcdatabase.Request\032\026.grpcda" +
      "tabase.Response\0224\n\003Del\022\025.grpcdatabase.Re" +
      "quest\032\026.grpcdatabase.Response\022;\n\nTestAnd" +
      "Set\022\025.grpcdatabase.Request\032\026.grpcdatabas" +
      "e.ResponseB\'\n\020br.com.sd.victorB\021GrpcData" +
      "baseProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_grpcdatabase_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcdatabase_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdatabase_Request_descriptor,
        new java.lang.String[] { "Key", "Value", "CheckingVersion", });
    internal_static_grpcdatabase_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcdatabase_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdatabase_Response_descriptor,
        new java.lang.String[] { "Result", "Value", });
    internal_static_grpcdatabase_Value_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpcdatabase_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdatabase_Value_descriptor,
        new java.lang.String[] { "Version", "Timestamp", "Data", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}