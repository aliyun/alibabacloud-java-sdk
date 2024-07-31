// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFirewallRulesResponseBody body;

    public static DeleteFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallRulesResponse self = new DeleteFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFirewallRulesResponse setBody(DeleteFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
