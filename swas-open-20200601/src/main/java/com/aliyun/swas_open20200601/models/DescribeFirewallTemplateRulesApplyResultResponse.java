// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeFirewallTemplateRulesApplyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallTemplateRulesApplyResultResponseBody body;

    public static DescribeFirewallTemplateRulesApplyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTemplateRulesApplyResultResponse self = new DescribeFirewallTemplateRulesApplyResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTemplateRulesApplyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallTemplateRulesApplyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallTemplateRulesApplyResultResponse setBody(DescribeFirewallTemplateRulesApplyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallTemplateRulesApplyResultResponseBody getBody() {
        return this.body;
    }

}
