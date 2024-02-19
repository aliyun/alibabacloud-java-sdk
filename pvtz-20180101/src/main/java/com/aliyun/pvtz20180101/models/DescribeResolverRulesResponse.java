// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResolverRulesResponseBody body;

    public static DescribeResolverRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRulesResponse self = new DescribeResolverRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResolverRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResolverRulesResponse setBody(DescribeResolverRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResolverRulesResponseBody getBody() {
        return this.body;
    }

}
