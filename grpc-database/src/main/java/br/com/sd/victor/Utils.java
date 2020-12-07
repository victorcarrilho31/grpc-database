package br.com.sd.victor;

import com.google.protobuf.ByteString;

public class Utils {

    public Response createResponse(Response.Result result, Value value) {
        Response.Builder builder = Response.newBuilder()
                .setResult(result);
        if(value != null) {
            builder.setValue(value);
        }
         return builder.build();
    }

    public Value createValue(MapValue mapValue) {
        return Value.newBuilder()
                .setVersion(mapValue.getVersion())
                .setTimestamp(mapValue.getTimestamp())
                .setData(ByteString.copyFrom(mapValue.getData().getBytes()))
                .build();
    }
}
