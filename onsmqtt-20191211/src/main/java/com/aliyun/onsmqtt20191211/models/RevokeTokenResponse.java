// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class RevokeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RevokeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeTokenResponse setBody(RevokeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTokenResponseBody getBody() {
        return this.body;
    }

}
