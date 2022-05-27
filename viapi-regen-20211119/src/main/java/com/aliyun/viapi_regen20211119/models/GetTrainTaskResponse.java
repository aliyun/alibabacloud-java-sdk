// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainTaskResponseBody body;

    public static GetTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskResponse self = new GetTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainTaskResponse setBody(GetTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainTaskResponseBody getBody() {
        return this.body;
    }

}
