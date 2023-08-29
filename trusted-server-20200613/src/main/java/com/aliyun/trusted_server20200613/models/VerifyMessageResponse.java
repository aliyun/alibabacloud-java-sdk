// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class VerifyMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyMessageResponseBody body;

    public static VerifyMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMessageResponse self = new VerifyMessageResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyMessageResponse setBody(VerifyMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyMessageResponseBody getBody() {
        return this.body;
    }

}
