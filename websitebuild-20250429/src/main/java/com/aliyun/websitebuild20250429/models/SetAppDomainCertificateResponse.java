// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SetAppDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAppDomainCertificateResponseBody body;

    public static SetAppDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppDomainCertificateResponse self = new SetAppDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetAppDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAppDomainCertificateResponse setBody(SetAppDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
