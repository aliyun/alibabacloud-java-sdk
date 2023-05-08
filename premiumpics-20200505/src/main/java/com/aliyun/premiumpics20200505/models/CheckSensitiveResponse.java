// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CheckSensitiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSensitiveResponseBody body;

    public static CheckSensitiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSensitiveResponse self = new CheckSensitiveResponse();
        return TeaModel.build(map, self);
    }

    public CheckSensitiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSensitiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSensitiveResponse setBody(CheckSensitiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSensitiveResponseBody getBody() {
        return this.body;
    }

}
