// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterCaCertificateResponseBody body;

    public static RegisterCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCaCertificateResponse self = new RegisterCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterCaCertificateResponse setBody(RegisterCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCaCertificateResponseBody getBody() {
        return this.body;
    }

}
