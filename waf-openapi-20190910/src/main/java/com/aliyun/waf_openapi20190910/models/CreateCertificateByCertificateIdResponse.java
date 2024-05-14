// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateCertificateByCertificateIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCertificateByCertificateIdResponseBody body;

    public static CreateCertificateByCertificateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateByCertificateIdResponse self = new CreateCertificateByCertificateIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateByCertificateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateByCertificateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCertificateByCertificateIdResponse setBody(CreateCertificateByCertificateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateByCertificateIdResponseBody getBody() {
        return this.body;
    }

}
