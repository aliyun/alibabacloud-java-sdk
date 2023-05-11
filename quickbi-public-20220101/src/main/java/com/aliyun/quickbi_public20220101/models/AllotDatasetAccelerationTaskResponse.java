// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AllotDatasetAccelerationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AllotDatasetAccelerationTaskResponseBody body;

    public static AllotDatasetAccelerationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AllotDatasetAccelerationTaskResponse self = new AllotDatasetAccelerationTaskResponse();
        return TeaModel.build(map, self);
    }

    public AllotDatasetAccelerationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllotDatasetAccelerationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllotDatasetAccelerationTaskResponse setBody(AllotDatasetAccelerationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AllotDatasetAccelerationTaskResponseBody getBody() {
        return this.body;
    }

}
