package br.com.sd.victor;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8088)
                .usePlaintext()
                .build();

        GrpcDatabaseGrpc.GrpcDatabaseBlockingStub stub
                = GrpcDatabaseGrpc.newBlockingStub(channel);

        // Teste inserindo valor
        Value value = Value.newBuilder()
                .setData(ByteString.copyFrom("Teste".getBytes()))
                .setTimestamp(System.currentTimeMillis())
                .build();
        Request request = Request.newBuilder()
                .setKey(2L)
                .setValue(value)
                .build();

        Response response = stub.set(request);
        System.out.println(response.getResult().getValueDescriptor().getName());
        System.out.println(response.getValue().toString());

        Thread.sleep(30000);

        // Teste inserindo valor
//        Value value1 = Value.newBuilder()
//                .setData(ByteString.copyFrom("Teste".getBytes()))
//                .setTimestamp(System.currentTimeMillis())
//                .build();
//        Request request1 = Request.newBuilder()
//                .setKey(2L)
//                .setValue(value1)
//                .build();
//
//        Response response1 = stub.set(request1);
//        System.out.println(response1.getResult().getValueDescriptor().getName());
//        System.out.println(response1.getValue().toString());
//

        // Teste buscando valor
//        Request request2 = Request.newBuilder()
//                .setKey(2L)
//                .build();
//
//        Response response2 = stub.get(request2);
//        System.out.println(response2.getResult().getValueDescriptor().getName());
//        System.out.println(response2.getValue().toString());
//
//        Thread.sleep(10000);
//
        // Teste Deletando valor sem checagem de versão
//        Request request3 = Request.newBuilder()
//                .setKey(1L)
//                .build();
//
//        Response response3 = stub.del(request3);
//        System.out.println(response3.getResult().getValueDescriptor().getName());
//        System.out.println(response3.getValue().toString());

        // Teste Deletando valor com checagem de versão
//        Request request4 = Request.newBuilder()
//                .setKey(2L)
//                .setCheckingVersion(1L)
//                .build();
//
//        Response response4 = stub.del(request4);
//        System.out.println(response4.getResult().getValueDescriptor().getName());
//        System.out.println(response4.getValue().toString());

        Value value5 = Value.newBuilder()
                .setVersion(3L)
                .setTimestamp(System.currentTimeMillis())
                .setData(ByteString.copyFrom("Teste nova versão".getBytes()))
                .build();
        Request request5 = Request.newBuilder()
                .setKey(1L)
                .setCheckingVersion(2L)
                .setValue(value5)
                .build();

        Response response5 = stub.testAndSet(request5);
        System.out.println(response5.getResult().getValueDescriptor().getName());
        System.out.println(response5.getValue().toString());

        channel.shutdown();
    }
}
