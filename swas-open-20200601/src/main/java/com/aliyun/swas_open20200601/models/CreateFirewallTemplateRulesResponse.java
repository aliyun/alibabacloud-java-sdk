// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallTemplateRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFirewallTemplateRulesResponseBody body;

    public static CreateFirewallTemplateRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallTemplateRulesResponse self = new CreateFirewallTemplateRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateFirewallTemplateRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFirewallTemplateRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFirewallTemplateRulesResponse setBody(CreateFirewallTemplateRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFirewallTemplateRulesResponseBody getBody() {
        return this.body;
    }

}
