// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetTokenResponseBody body;

    public static ResetTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetTokenResponse self = new ResetTokenResponse();
        return TeaModel.build(map, self);
    }

    public ResetTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetTokenResponse setBody(ResetTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetTokenResponseBody getBody() {
        return this.body;
    }

}
