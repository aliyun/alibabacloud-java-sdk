// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCaCertificateResponseBody body;

    public static DeleteCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCaCertificateResponse self = new DeleteCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCaCertificateResponse setBody(DeleteCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCaCertificateResponseBody getBody() {
        return this.body;
    }

}
