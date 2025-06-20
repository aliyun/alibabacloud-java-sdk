// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeEndResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeEndResponseBody body;

    public static SafeChangeEndResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeEndResponse self = new SafeChangeEndResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeEndResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeEndResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeEndResponse setBody(SafeChangeEndResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeEndResponseBody getBody() {
        return this.body;
    }

}
