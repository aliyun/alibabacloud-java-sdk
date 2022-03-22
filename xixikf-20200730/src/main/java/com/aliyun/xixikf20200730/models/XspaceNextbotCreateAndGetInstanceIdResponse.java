// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAndGetInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotCreateAndGetInstanceIdResponseBody body;

    public static XspaceNextbotCreateAndGetInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAndGetInstanceIdResponse self = new XspaceNextbotCreateAndGetInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAndGetInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponse setBody(XspaceNextbotCreateAndGetInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotCreateAndGetInstanceIdResponseBody getBody() {
        return this.body;
    }

}
