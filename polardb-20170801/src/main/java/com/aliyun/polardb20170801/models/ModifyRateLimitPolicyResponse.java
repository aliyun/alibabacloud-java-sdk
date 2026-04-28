// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyRateLimitPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRateLimitPolicyResponseBody body;

    public static ModifyRateLimitPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRateLimitPolicyResponse self = new ModifyRateLimitPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRateLimitPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRateLimitPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRateLimitPolicyResponse setBody(ModifyRateLimitPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRateLimitPolicyResponseBody getBody() {
        return this.body;
    }

}
