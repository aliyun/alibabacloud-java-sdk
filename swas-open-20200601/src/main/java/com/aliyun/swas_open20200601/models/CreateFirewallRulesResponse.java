// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFirewallRulesResponseBody body;

    public static CreateFirewallRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesResponse self = new CreateFirewallRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFirewallRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFirewallRulesResponse setBody(CreateFirewallRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFirewallRulesResponseBody getBody() {
        return this.body;
    }

}
