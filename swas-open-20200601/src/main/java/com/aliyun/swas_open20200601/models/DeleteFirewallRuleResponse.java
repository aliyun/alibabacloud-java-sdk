// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteFirewallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFirewallRuleResponseBody body;

    public static DeleteFirewallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallRuleResponse self = new DeleteFirewallRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFirewallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFirewallRuleResponse setBody(DeleteFirewallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFirewallRuleResponseBody getBody() {
        return this.body;
    }

}
