// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class InterruptForArbitrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InterruptForArbitrationResponseBody body;

    public static InterruptForArbitrationResponse build(java.util.Map<String, ?> map) throws Exception {
        InterruptForArbitrationResponse self = new InterruptForArbitrationResponse();
        return TeaModel.build(map, self);
    }

    public InterruptForArbitrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InterruptForArbitrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InterruptForArbitrationResponse setBody(InterruptForArbitrationResponseBody body) {
        this.body = body;
        return this;
    }
    public InterruptForArbitrationResponseBody getBody() {
        return this.body;
    }

}
