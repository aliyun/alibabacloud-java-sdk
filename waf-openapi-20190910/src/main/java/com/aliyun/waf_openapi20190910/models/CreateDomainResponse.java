// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDomainResponseBody body;

    public static CreateDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponse self = new CreateDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainResponse setBody(CreateDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainResponseBody getBody() {
        return this.body;
    }

}
