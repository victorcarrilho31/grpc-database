// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_database.proto

package br.com.sd.victor;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcdatabase.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpcdatabase.Response.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.grpcdatabase.Response.Result result = 1;</code>
   * @return The result.
   */
  br.com.sd.victor.Response.Result getResult();

  /**
   * <code>.grpcdatabase.Value value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.grpcdatabase.Value value = 2;</code>
   * @return The value.
   */
  br.com.sd.victor.Value getValue();
  /**
   * <code>.grpcdatabase.Value value = 2;</code>
   */
  br.com.sd.victor.ValueOrBuilder getValueOrBuilder();
}