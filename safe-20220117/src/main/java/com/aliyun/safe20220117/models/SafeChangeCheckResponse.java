// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeCheckResponseBody body;

    public static SafeChangeCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCheckResponse self = new SafeChangeCheckResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeCheckResponse setBody(SafeChangeCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeCheckResponseBody getBody() {
        return this.body;
    }

}
