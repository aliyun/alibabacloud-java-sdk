// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendAsyncChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendAsyncChatMessageResponseBody body;

    public static SendAsyncChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncChatMessageResponse self = new SendAsyncChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendAsyncChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAsyncChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendAsyncChatMessageResponse setBody(SendAsyncChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAsyncChatMessageResponseBody getBody() {
        return this.body;
    }

}
