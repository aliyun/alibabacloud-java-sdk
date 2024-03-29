// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class XspaceNextbotInitTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotInitTenantResponseBody body;

    public static XspaceNextbotInitTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotInitTenantResponse self = new XspaceNextbotInitTenantResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotInitTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotInitTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XspaceNextbotInitTenantResponse setBody(XspaceNextbotInitTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotInitTenantResponseBody getBody() {
        return this.body;
    }

}
