// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class EnableFirewallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableFirewallRuleResponseBody body;

    public static EnableFirewallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFirewallRuleResponse self = new EnableFirewallRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableFirewallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFirewallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFirewallRuleResponse setBody(EnableFirewallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFirewallRuleResponseBody getBody() {
        return this.body;
    }

}
