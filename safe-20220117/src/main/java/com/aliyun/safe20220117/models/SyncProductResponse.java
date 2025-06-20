// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SyncProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncProductResponseBody body;

    public static SyncProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncProductResponse self = new SyncProductResponse();
        return TeaModel.build(map, self);
    }

    public SyncProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncProductResponse setBody(SyncProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncProductResponseBody getBody() {
        return this.body;
    }

}
