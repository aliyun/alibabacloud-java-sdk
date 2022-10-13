// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCertificateResponseBody body;

    public static CheckCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCertificateResponse self = new CheckCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CheckCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCertificateResponse setBody(CheckCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCertificateResponseBody getBody() {
        return this.body;
    }

}
