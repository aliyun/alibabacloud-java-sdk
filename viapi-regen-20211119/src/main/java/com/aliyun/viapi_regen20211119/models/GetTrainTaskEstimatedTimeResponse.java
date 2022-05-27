// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskEstimatedTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainTaskEstimatedTimeResponseBody body;

    public static GetTrainTaskEstimatedTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskEstimatedTimeResponse self = new GetTrainTaskEstimatedTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskEstimatedTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainTaskEstimatedTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrainTaskEstimatedTimeResponse setBody(GetTrainTaskEstimatedTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainTaskEstimatedTimeResponseBody getBody() {
        return this.body;
    }

}
