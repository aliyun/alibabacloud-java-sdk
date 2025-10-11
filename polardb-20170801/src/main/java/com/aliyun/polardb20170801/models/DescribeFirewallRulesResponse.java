// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallRulesResponseBody body;

    public static DescribeFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallRulesResponse self = new DescribeFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallRulesResponse setBody(DescribeFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
