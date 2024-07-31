// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ApplyFirewallTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyFirewallTemplateResponseBody body;

    public static ApplyFirewallTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyFirewallTemplateResponse self = new ApplyFirewallTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyFirewallTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyFirewallTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyFirewallTemplateResponse setBody(ApplyFirewallTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyFirewallTemplateResponseBody getBody() {
        return this.body;
    }

}
