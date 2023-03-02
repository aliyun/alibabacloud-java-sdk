// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFirewallRulesResponseBody body;

    public static ListFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFirewallRulesResponse self = new ListFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFirewallRulesResponse setBody(ListFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
