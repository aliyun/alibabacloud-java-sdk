// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchPeekMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPeekMessageResponseBody body;

    public static BatchPeekMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPeekMessageResponse self = new BatchPeekMessageResponse();
        return TeaModel.build(map, self);
    }

    public BatchPeekMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPeekMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPeekMessageResponse setBody(BatchPeekMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPeekMessageResponseBody getBody() {
        return this.body;
    }

}
