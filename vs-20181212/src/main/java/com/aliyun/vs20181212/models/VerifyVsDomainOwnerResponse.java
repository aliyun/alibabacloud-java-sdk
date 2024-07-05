// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class VerifyVsDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyVsDomainOwnerResponseBody body;

    public static VerifyVsDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyVsDomainOwnerResponse self = new VerifyVsDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyVsDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyVsDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyVsDomainOwnerResponse setBody(VerifyVsDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyVsDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
