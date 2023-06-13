// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DisableFirewallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableFirewallRuleResponseBody body;

    public static DisableFirewallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFirewallRuleResponse self = new DisableFirewallRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableFirewallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFirewallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableFirewallRuleResponse setBody(DisableFirewallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFirewallRuleResponseBody getBody() {
        return this.body;
    }

}
