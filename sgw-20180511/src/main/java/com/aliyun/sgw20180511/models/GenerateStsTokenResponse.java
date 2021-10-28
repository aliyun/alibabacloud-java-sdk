// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateStsTokenResponseBody body;

    public static GenerateStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateStsTokenResponse self = new GenerateStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateStsTokenResponse setBody(GenerateStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateStsTokenResponseBody getBody() {
        return this.body;
    }

}
