// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFirewallRuleResponseBody body;

    public static CreateFirewallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRuleResponse self = new CreateFirewallRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFirewallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFirewallRuleResponse setBody(CreateFirewallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFirewallRuleResponseBody getBody() {
        return this.body;
    }

}
