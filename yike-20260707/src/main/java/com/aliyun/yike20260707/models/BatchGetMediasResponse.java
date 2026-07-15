// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class BatchGetMediasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetMediasResponseBody body;

    public static BatchGetMediasResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediasResponse self = new BatchGetMediasResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetMediasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetMediasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetMediasResponse setBody(BatchGetMediasResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetMediasResponseBody getBody() {
        return this.body;
    }

}
