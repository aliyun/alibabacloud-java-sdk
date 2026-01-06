// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ValidateDatabaseUserTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateDatabaseUserTokenResponseBody body;

    public static ValidateDatabaseUserTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateDatabaseUserTokenResponse self = new ValidateDatabaseUserTokenResponse();
        return TeaModel.build(map, self);
    }

    public ValidateDatabaseUserTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateDatabaseUserTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateDatabaseUserTokenResponse setBody(ValidateDatabaseUserTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateDatabaseUserTokenResponseBody getBody() {
        return this.body;
    }

}
