// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkerListResponseBody body;

    public static GetWorkerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerListResponse self = new GetWorkerListResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkerListResponse setBody(GetWorkerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkerListResponseBody getBody() {
        return this.body;
    }

}
