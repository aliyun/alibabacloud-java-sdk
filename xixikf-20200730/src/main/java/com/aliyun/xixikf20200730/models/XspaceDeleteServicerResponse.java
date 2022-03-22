// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceDeleteServicerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceDeleteServicerResponseBody body;

    public static XspaceDeleteServicerResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceDeleteServicerResponse self = new XspaceDeleteServicerResponse();
        return TeaModel.build(map, self);
    }

    public XspaceDeleteServicerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceDeleteServicerResponse setBody(XspaceDeleteServicerResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceDeleteServicerResponseBody getBody() {
        return this.body;
    }

}
