// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceGetInstanceIdByBuIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceGetInstanceIdByBuIdResponseBody body;

    public static XspaceGetInstanceIdByBuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceGetInstanceIdByBuIdResponse self = new XspaceGetInstanceIdByBuIdResponse();
        return TeaModel.build(map, self);
    }

    public XspaceGetInstanceIdByBuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceGetInstanceIdByBuIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XspaceGetInstanceIdByBuIdResponse setBody(XspaceGetInstanceIdByBuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceGetInstanceIdByBuIdResponseBody getBody() {
        return this.body;
    }

}
