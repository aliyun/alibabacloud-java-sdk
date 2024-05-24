// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCACertificateResponseBody body;

    public static DeleteCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCACertificateResponse self = new DeleteCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCACertificateResponse setBody(DeleteCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCACertificateResponseBody getBody() {
        return this.body;
    }

}
