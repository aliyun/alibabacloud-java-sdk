// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppDomainCertificateResponseBody body;

    public static DeleteAppDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDomainCertificateResponse self = new DeleteAppDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppDomainCertificateResponse setBody(DeleteAppDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
