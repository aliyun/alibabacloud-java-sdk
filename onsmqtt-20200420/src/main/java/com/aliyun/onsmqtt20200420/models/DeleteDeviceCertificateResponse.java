// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteDeviceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceCertificateResponseBody body;

    public static DeleteDeviceCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceCertificateResponse self = new DeleteDeviceCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceCertificateResponse setBody(DeleteDeviceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceCertificateResponseBody getBody() {
        return this.body;
    }

}
