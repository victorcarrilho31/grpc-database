package br.com.sd.victor;

import io.grpc.stub.StreamObserver;

public class GetData implements Runnable {

    private final Request request;
    private final StreamObserver<Response> responseObserver;
    private Database database;
    private Utils utils = new Utils();

    public GetData(Request request, StreamObserver<Response> responseObserver, Database database) {
        this.request = request;
        this.responseObserver = responseObserver;
        this.database = database;
    }

    @Override
    public void run() {
        MapValue mapValue = database.getData(request.getKey());
        Response response = null;
        if (mapValue != null) {
            Value value = utils.createValue(mapValue);
            response = utils.createResponse(Response.Result.SUCCESS, value);
        } else {
            response = utils.createResponse(Response.Result.ERROR, null);
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
