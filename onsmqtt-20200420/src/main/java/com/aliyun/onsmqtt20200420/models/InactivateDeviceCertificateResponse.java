// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateDeviceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InactivateDeviceCertificateResponseBody body;

    public static InactivateDeviceCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        InactivateDeviceCertificateResponse self = new InactivateDeviceCertificateResponse();
        return TeaModel.build(map, self);
    }

    public InactivateDeviceCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InactivateDeviceCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InactivateDeviceCertificateResponse setBody(InactivateDeviceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public InactivateDeviceCertificateResponseBody getBody() {
        return this.body;
    }

}
