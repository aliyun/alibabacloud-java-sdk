// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResolverRuleResponseBody body;

    public static DescribeResolverRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRuleResponse self = new DescribeResolverRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResolverRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResolverRuleResponse setBody(DescribeResolverRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResolverRuleResponseBody getBody() {
        return this.body;
    }

}
