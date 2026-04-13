// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class DeleteChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatResponseBody body;

    public static DeleteChatResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatResponse self = new DeleteChatResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatResponse setBody(DeleteChatResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatResponseBody getBody() {
        return this.body;
    }

}
