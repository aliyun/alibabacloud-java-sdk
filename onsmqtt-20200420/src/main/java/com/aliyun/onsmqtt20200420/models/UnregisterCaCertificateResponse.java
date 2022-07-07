// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnregisterCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterCaCertificateResponseBody body;

    public static UnregisterCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCaCertificateResponse self = new UnregisterCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnregisterCaCertificateResponse setBody(UnregisterCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterCaCertificateResponseBody getBody() {
        return this.body;
    }

}
