// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFirewallTemplateResponseBody body;

    public static ModifyFirewallTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallTemplateResponse self = new ModifyFirewallTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFirewallTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFirewallTemplateResponse setBody(ModifyFirewallTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFirewallTemplateResponseBody getBody() {
        return this.body;
    }

}
