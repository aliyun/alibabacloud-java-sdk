// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAliyunInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceNextbotCreateAliyunInstanceResponseBody body;

    public static XspaceNextbotCreateAliyunInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAliyunInstanceResponse self = new XspaceNextbotCreateAliyunInstanceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAliyunInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceNextbotCreateAliyunInstanceResponse setBody(XspaceNextbotCreateAliyunInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceNextbotCreateAliyunInstanceResponseBody getBody() {
        return this.body;
    }

}
