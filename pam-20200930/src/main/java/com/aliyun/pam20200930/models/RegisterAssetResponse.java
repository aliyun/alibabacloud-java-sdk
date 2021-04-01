// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class RegisterAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterAssetResponseBody body;

    public static RegisterAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAssetResponse self = new RegisterAssetResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterAssetResponse setBody(RegisterAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAssetResponseBody getBody() {
        return this.body;
    }

}
