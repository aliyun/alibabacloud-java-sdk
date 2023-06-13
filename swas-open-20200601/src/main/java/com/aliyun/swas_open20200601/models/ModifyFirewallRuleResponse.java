// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFirewallRuleResponseBody body;

    public static ModifyFirewallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRuleResponse self = new ModifyFirewallRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFirewallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFirewallRuleResponse setBody(ModifyFirewallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFirewallRuleResponseBody getBody() {
        return this.body;
    }

}
