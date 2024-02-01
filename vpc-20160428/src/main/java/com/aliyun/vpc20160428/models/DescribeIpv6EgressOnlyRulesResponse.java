// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6EgressOnlyRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpv6EgressOnlyRulesResponseBody body;

    public static DescribeIpv6EgressOnlyRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6EgressOnlyRulesResponse self = new DescribeIpv6EgressOnlyRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6EgressOnlyRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv6EgressOnlyRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpv6EgressOnlyRulesResponse setBody(DescribeIpv6EgressOnlyRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv6EgressOnlyRulesResponseBody getBody() {
        return this.body;
    }

}
