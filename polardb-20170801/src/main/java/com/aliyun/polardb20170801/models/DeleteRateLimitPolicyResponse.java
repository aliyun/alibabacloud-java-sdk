// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteRateLimitPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRateLimitPolicyResponseBody body;

    public static DeleteRateLimitPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRateLimitPolicyResponse self = new DeleteRateLimitPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRateLimitPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRateLimitPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRateLimitPolicyResponse setBody(DeleteRateLimitPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRateLimitPolicyResponseBody getBody() {
        return this.body;
    }

}
