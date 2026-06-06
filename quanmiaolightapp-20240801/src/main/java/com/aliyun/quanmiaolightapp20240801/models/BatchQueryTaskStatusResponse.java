// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchQueryTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryTaskStatusResponseBody body;

    public static BatchQueryTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryTaskStatusResponse self = new BatchQueryTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryTaskStatusResponse setBody(BatchQueryTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryTaskStatusResponseBody getBody() {
        return this.body;
    }

}
