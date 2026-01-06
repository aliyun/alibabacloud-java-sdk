// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ValidateUserTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateUserTokenResponseBody body;

    public static ValidateUserTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateUserTokenResponse self = new ValidateUserTokenResponse();
        return TeaModel.build(map, self);
    }

    public ValidateUserTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateUserTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateUserTokenResponse setBody(ValidateUserTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateUserTokenResponseBody getBody() {
        return this.body;
    }

}
