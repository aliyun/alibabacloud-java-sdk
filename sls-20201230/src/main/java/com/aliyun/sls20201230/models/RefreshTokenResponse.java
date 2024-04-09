// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class RefreshTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshTokenResponseBody body;

    public static RefreshTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenResponse self = new RefreshTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshTokenResponse setBody(RefreshTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshTokenResponseBody getBody() {
        return this.body;
    }

}
