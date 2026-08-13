// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableTokenResponseBody body;

    public static EnableTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableTokenResponse self = new EnableTokenResponse();
        return TeaModel.build(map, self);
    }

    public EnableTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableTokenResponse setBody(EnableTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableTokenResponseBody getBody() {
        return this.body;
    }

}
