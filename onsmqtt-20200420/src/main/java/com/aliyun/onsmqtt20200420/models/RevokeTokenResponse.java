// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RevokeTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeTokenResponseBody body;

    public static RevokeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenResponse self = new RevokeTokenResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeTokenResponse setBody(RevokeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTokenResponseBody getBody() {
        return this.body;
    }

}
