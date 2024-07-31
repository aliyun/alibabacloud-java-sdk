// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplateApplyResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallTemplateApplyResultsResponseBody body;

    public static DescribeFirewallTemplateApplyResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplateApplyResultsResponse self = new DescribeFirewallTemplateApplyResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplateApplyResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallTemplateApplyResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallTemplateApplyResultsResponse setBody(DescribeFirewallTemplateApplyResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallTemplateApplyResultsResponseBody getBody() {
        return this.body;
    }

}
