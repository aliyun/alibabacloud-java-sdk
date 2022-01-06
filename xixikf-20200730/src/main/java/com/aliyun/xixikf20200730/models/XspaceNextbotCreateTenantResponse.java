// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotCreateTenantResponseBody body;

    public static XspaceNextbotCreateTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateTenantResponse self = new XspaceNextbotCreateTenantResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotCreateTenantResponse setBody(XspaceNextbotCreateTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotCreateTenantResponseBody getBody() {
        return this.body;
    }

}
