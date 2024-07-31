// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFirewallTemplateResponseBody body;

    public static CreateFirewallTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallTemplateResponse self = new CreateFirewallTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateFirewallTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFirewallTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFirewallTemplateResponse setBody(CreateFirewallTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFirewallTemplateResponseBody getBody() {
        return this.body;
    }

}
