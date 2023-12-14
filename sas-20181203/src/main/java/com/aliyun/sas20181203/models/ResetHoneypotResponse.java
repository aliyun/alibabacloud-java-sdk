// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetHoneypotResponseBody body;

    public static ResetHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetHoneypotResponse self = new ResetHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public ResetHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetHoneypotResponse setBody(ResetHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetHoneypotResponseBody getBody() {
        return this.body;
    }

}
