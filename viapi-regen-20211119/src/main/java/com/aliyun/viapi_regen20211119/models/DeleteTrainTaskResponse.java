// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrainTaskResponseBody body;

    public static DeleteTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainTaskResponse self = new DeleteTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrainTaskResponse setBody(DeleteTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrainTaskResponseBody getBody() {
        return this.body;
    }

}
