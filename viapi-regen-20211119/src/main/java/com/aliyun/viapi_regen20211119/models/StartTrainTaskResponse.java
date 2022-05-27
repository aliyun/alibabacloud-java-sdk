// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartTrainTaskResponseBody body;

    public static StartTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTrainTaskResponse self = new StartTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTrainTaskResponse setBody(StartTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTrainTaskResponseBody getBody() {
        return this.body;
    }

}
