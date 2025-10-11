// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFirewallRulesResponseBody body;

    public static ModifyFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRulesResponse self = new ModifyFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFirewallRulesResponse setBody(ModifyFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
