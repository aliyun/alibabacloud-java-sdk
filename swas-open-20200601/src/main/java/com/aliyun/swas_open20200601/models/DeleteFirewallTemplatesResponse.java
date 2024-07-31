// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteFirewallTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFirewallTemplatesResponseBody body;

    public static DeleteFirewallTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFirewallTemplatesResponse self = new DeleteFirewallTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFirewallTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFirewallTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFirewallTemplatesResponse setBody(DeleteFirewallTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFirewallTemplatesResponseBody getBody() {
        return this.body;
    }

}
