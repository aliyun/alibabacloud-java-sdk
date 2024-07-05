// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVsDomainCertificateResponseBody body;

    public static SetVsDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVsDomainCertificateResponse self = new SetVsDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetVsDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVsDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVsDomainCertificateResponse setBody(SetVsDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVsDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
