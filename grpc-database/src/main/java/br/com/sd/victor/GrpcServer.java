package br.com.sd.victor;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        Database database = new Database();
        Server server = ServerBuilder
                .forPort(8088)
                .addService(new GrpcDatabaseServiceImpl(database))
                .build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}
