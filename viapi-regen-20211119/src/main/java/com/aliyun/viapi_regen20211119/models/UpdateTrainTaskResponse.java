// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrainTaskResponseBody body;

    public static UpdateTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainTaskResponse self = new UpdateTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrainTaskResponse setBody(UpdateTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrainTaskResponseBody getBody() {
        return this.body;
    }

}
