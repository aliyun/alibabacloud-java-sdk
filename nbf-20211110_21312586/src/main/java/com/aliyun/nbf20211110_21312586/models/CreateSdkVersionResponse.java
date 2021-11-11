// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class CreateSdkVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.io.InputStream body;

    public static CreateSdkVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSdkVersionResponse self = new CreateSdkVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSdkVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSdkVersionResponse setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
