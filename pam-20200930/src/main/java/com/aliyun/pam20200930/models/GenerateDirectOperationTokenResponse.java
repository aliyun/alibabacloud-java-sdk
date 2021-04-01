// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GenerateDirectOperationTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDirectOperationTokenResponseBody body;

    public static GenerateDirectOperationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDirectOperationTokenResponse self = new GenerateDirectOperationTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDirectOperationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDirectOperationTokenResponse setBody(GenerateDirectOperationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDirectOperationTokenResponseBody getBody() {
        return this.body;
    }

}
