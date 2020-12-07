package br.com.sd.victor;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GrpcDatabaseServiceImpl extends GrpcDatabaseGrpc.GrpcDatabaseImplBase {

    private ExecutorService threadPool = Executors.newCachedThreadPool();
    private Database database;

    public GrpcDatabaseServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public void set(Request request, StreamObserver<Response> responseObserver) {
        threadPool.execute(new SetData(request, responseObserver, database));
    }

    @Override
    public void get(Request request, StreamObserver<Response> responseObserver) {
        threadPool.execute(new GetData(request, responseObserver, database));
    }

    @Override
    public void del(Request request, StreamObserver<Response> responseObserver) {
        threadPool.execute(new DeleteData(request, responseObserver, database));
    }

    @Override
    public void testAndSet(Request request, StreamObserver<Response> responseObserver) {
        threadPool.execute(new TestAndSetData(request, responseObserver, database));
    }
}


//        Response response = Response.newBuilder().setResult(Response.Result.SUCCESS).build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
