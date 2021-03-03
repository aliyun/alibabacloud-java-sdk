// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertificateResponseBody body;

    public static CreateCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateResponse self = new CreateCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateResponse setBody(CreateCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateResponseBody getBody() {
        return this.body;
    }

}
