// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServerCertificateResponseBody body;

    public static DeleteServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerCertificateResponse self = new DeleteServerCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServerCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServerCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServerCertificateResponse setBody(DeleteServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerCertificateResponseBody getBody() {
        return this.body;
    }

}
