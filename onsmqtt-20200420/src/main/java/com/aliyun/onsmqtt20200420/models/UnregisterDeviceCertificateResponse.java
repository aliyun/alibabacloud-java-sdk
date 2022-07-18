// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnregisterDeviceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterDeviceCertificateResponseBody body;

    public static UnregisterDeviceCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDeviceCertificateResponse self = new UnregisterDeviceCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterDeviceCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterDeviceCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnregisterDeviceCertificateResponse setBody(UnregisterDeviceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterDeviceCertificateResponseBody getBody() {
        return this.body;
    }

}
