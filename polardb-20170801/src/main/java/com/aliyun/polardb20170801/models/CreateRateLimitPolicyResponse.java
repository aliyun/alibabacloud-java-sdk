// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateRateLimitPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRateLimitPolicyResponseBody body;

    public static CreateRateLimitPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRateLimitPolicyResponse self = new CreateRateLimitPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateRateLimitPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRateLimitPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRateLimitPolicyResponse setBody(CreateRateLimitPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRateLimitPolicyResponseBody getBody() {
        return this.body;
    }

}
