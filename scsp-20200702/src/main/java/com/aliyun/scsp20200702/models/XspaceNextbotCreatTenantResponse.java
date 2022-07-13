// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreatTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotCreatTenantResponseBody body;

    public static XspaceNextbotCreatTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreatTenantResponse self = new XspaceNextbotCreatTenantResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreatTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotCreatTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XspaceNextbotCreatTenantResponse setBody(XspaceNextbotCreatTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotCreatTenantResponseBody getBody() {
        return this.body;
    }

}
