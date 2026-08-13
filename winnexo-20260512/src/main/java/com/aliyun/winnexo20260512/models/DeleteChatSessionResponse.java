// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteChatSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatSessionResponseBody body;

    public static DeleteChatSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatSessionResponse self = new DeleteChatSessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatSessionResponse setBody(DeleteChatSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatSessionResponseBody getBody() {
        return this.body;
    }

}
