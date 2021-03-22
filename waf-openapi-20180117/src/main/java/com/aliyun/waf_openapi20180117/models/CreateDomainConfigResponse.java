// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDomainConfigResponseBody body;

    public static CreateDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainConfigResponse self = new CreateDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDomainConfigResponse setBody(CreateDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDomainConfigResponseBody getBody() {
        return this.body;
    }

}
