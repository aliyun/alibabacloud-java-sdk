// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveCaCertificateResponseBody body;

    public static ActiveCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveCaCertificateResponse self = new ActiveCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ActiveCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveCaCertificateResponse setBody(ActiveCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveCaCertificateResponseBody getBody() {
        return this.body;
    }

}
