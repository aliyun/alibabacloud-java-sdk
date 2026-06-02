// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ChatConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatConversationResponseBody body;

    public static ChatConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatConversationResponse self = new ChatConversationResponse();
        return TeaModel.build(map, self);
    }

    public ChatConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatConversationResponse setBody(ChatConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatConversationResponseBody getBody() {
        return this.body;
    }

}
