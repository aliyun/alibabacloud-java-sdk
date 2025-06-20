// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeQueryResponseBody body;

    public static SafeChangeQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryResponse self = new SafeChangeQueryResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeQueryResponse setBody(SafeChangeQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeQueryResponseBody getBody() {
        return this.body;
    }

}
