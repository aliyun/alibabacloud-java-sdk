// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PeekMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PeekMessageResponseBody body;

    public static PeekMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PeekMessageResponse self = new PeekMessageResponse();
        return TeaModel.build(map, self);
    }

    public PeekMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PeekMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PeekMessageResponse setBody(PeekMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PeekMessageResponseBody getBody() {
        return this.body;
    }

}
