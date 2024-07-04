// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateSM2CertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSM2CertResponseBody body;

    public static CreateSM2CertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSM2CertResponse self = new CreateSM2CertResponse();
        return TeaModel.build(map, self);
    }

    public CreateSM2CertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSM2CertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSM2CertResponse setBody(CreateSM2CertResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSM2CertResponseBody getBody() {
        return this.body;
    }

}
