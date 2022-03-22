// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotGetInstanceIdByBuIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotGetInstanceIdByBuIdResponseBody body;

    public static XspaceNextbotGetInstanceIdByBuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotGetInstanceIdByBuIdResponse self = new XspaceNextbotGetInstanceIdByBuIdResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotGetInstanceIdByBuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponse setBody(XspaceNextbotGetInstanceIdByBuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotGetInstanceIdByBuIdResponseBody getBody() {
        return this.body;
    }

}
