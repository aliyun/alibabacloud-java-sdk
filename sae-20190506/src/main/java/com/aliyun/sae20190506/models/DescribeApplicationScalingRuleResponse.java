// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationScalingRuleResponseBody body;

    public static DescribeApplicationScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRuleResponse self = new DescribeApplicationScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationScalingRuleResponse setBody(DescribeApplicationScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

}
