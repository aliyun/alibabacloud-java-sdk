// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeRateLimitPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRateLimitPolicyResponseBody body;

    public static DescribeRateLimitPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateLimitPolicyResponse self = new DescribeRateLimitPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRateLimitPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRateLimitPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRateLimitPolicyResponse setBody(DescribeRateLimitPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRateLimitPolicyResponseBody getBody() {
        return this.body;
    }

}
