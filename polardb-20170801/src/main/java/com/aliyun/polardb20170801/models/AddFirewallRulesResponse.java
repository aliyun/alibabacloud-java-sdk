// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFirewallRulesResponseBody body;

    public static AddFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFirewallRulesResponse self = new AddFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public AddFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFirewallRulesResponse setBody(AddFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
