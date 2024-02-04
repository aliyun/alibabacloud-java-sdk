// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableFirewallRulesResponseBody body;

    public static EnableFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFirewallRulesResponse self = new EnableFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public EnableFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFirewallRulesResponse setBody(EnableFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
