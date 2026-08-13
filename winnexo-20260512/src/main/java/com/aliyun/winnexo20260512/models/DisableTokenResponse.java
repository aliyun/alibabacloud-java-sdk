// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableTokenResponseBody body;

    public static DisableTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableTokenResponse self = new DisableTokenResponse();
        return TeaModel.build(map, self);
    }

    public DisableTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableTokenResponse setBody(DisableTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTokenResponseBody getBody() {
        return this.body;
    }

}
