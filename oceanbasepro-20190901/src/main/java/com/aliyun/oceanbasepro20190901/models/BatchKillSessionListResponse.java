// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillSessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchKillSessionListResponseBody body;

    public static BatchKillSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchKillSessionListResponse self = new BatchKillSessionListResponse();
        return TeaModel.build(map, self);
    }

    public BatchKillSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchKillSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchKillSessionListResponse setBody(BatchKillSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchKillSessionListResponseBody getBody() {
        return this.body;
    }

}
