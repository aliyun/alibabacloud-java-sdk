// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterMediaResponseBody body;

    public static RegisterMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaResponse self = new RegisterMediaResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaResponse setBody(RegisterMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaResponseBody getBody() {
        return this.body;
    }

}
