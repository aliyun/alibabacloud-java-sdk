// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateDomainExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDomainExtensionResponseBody body;

    public static CreateDomainExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainExtensionResponse self = new CreateDomainExtensionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDomainExtensionResponse setBody(CreateDomainExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainExtensionResponseBody getBody() {
        return this.body;
    }

}
