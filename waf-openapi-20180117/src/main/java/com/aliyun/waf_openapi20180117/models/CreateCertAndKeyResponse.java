// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateCertAndKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertAndKeyResponseBody body;

    public static CreateCertAndKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertAndKeyResponse self = new CreateCertAndKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertAndKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertAndKeyResponse setBody(CreateCertAndKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertAndKeyResponseBody getBody() {
        return this.body;
    }

}
