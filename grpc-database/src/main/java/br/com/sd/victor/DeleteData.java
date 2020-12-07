package br.com.sd.victor;

import io.grpc.stub.StreamObserver;

public class DeleteData implements Runnable {

    private final Request request;
    private final StreamObserver<Response> responseObserver;
    private Database database;
    private Utils utils = new Utils();

    public DeleteData(Request request, StreamObserver<Response> responseObserver, Database database) {
        this.request = request;
        this.responseObserver = responseObserver;
        this.database = database;
    }

    @Override
    public void run() {
        MapValue mapValue = database.getData(request.getKey());
        Response response = null;
        if(mapValue != null) {
            if( (request.getCheckingVersion() == 0L)
                    || (request.getCheckingVersion() != 0L && request.getCheckingVersion() == mapValue.getVersion()) ) {
                MapValue removed = database.removeData(request.getKey());
                Value value = utils.createValue(removed);
                response = utils.createResponse(Response.Result.SUCCESS, value);
            } else {
                Value value = utils.createValue(mapValue);
                response = utils.createResponse(Response.Result.ERROR_WV, value);
            }
        } else {
            if(request.getCheckingVersion() == 0L) {
                response = utils.createResponse(Response.Result.ERROR, null);
            } else {
                response = utils.createResponse(Response.Result.ERROR_NE, null);
            }
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
