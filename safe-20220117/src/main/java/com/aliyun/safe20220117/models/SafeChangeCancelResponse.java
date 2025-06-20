// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeCancelResponseBody body;

    public static SafeChangeCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCancelResponse self = new SafeChangeCancelResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeCancelResponse setBody(SafeChangeCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeCancelResponseBody getBody() {
        return this.body;
    }

}
