// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceCertificateResponseBody body;

    public static GetDeviceCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCertificateResponse self = new GetDeviceCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceCertificateResponse setBody(GetDeviceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceCertificateResponseBody getBody() {
        return this.body;
    }

}
