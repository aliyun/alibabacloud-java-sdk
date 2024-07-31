// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallTemplatesResponseBody body;

    public static DescribeFirewallTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplatesResponse self = new DescribeFirewallTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallTemplatesResponse setBody(DescribeFirewallTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallTemplatesResponseBody getBody() {
        return this.body;
    }

}
