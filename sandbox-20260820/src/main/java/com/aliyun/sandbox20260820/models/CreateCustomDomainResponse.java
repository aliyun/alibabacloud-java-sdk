// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomDomainResp body;

    public static CreateCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainResponse self = new CreateCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomDomainResponse setBody(CustomDomainResp body) {
        this.body = body;
        return this;
    }
    public CustomDomainResp getBody() {
        return this.body;
    }

}
