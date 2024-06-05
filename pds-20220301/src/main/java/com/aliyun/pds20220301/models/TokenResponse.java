// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Token body;

    public static TokenResponse build(java.util.Map<String, ?> map) throws Exception {
        TokenResponse self = new TokenResponse();
        return TeaModel.build(map, self);
    }

    public TokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TokenResponse setBody(Token body) {
        this.body = body;
        return this;
    }
    public Token getBody() {
        return this.body;
    }

}
