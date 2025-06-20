// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeStartResponseBody body;

    public static SafeChangeStartResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartResponse self = new SafeChangeStartResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeStartResponse setBody(SafeChangeStartResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeStartResponseBody getBody() {
        return this.body;
    }

}
