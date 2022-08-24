// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InactivateCaCertificateResponseBody body;

    public static InactivateCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        InactivateCaCertificateResponse self = new InactivateCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public InactivateCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InactivateCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InactivateCaCertificateResponse setBody(InactivateCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public InactivateCaCertificateResponseBody getBody() {
        return this.body;
    }

}
