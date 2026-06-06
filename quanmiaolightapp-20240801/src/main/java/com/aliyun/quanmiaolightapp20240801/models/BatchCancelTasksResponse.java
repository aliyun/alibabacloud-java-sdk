// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchCancelTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCancelTasksResponseBody body;

    public static BatchCancelTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTasksResponse self = new BatchCancelTasksResponse();
        return TeaModel.build(map, self);
    }

    public BatchCancelTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCancelTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCancelTasksResponse setBody(BatchCancelTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCancelTasksResponseBody getBody() {
        return this.body;
    }

}
