// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceAddIdpXspaceAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceAddIdpXspaceAccountResponseBody body;

    public static XspaceAddIdpXspaceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceAddIdpXspaceAccountResponse self = new XspaceAddIdpXspaceAccountResponse();
        return TeaModel.build(map, self);
    }

    public XspaceAddIdpXspaceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceAddIdpXspaceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XspaceAddIdpXspaceAccountResponse setBody(XspaceAddIdpXspaceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceAddIdpXspaceAccountResponseBody getBody() {
        return this.body;
    }

}
