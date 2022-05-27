// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopTrainTaskResponseBody body;

    public static StopTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrainTaskResponse self = new StopTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTrainTaskResponse setBody(StopTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrainTaskResponseBody getBody() {
        return this.body;
    }

}
