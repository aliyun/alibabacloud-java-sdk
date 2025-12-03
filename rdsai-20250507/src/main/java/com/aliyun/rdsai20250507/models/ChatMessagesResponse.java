// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatMessagesResponseBody body;

    public static ChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesResponse self = new ChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatMessagesResponse setBody(ChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatMessagesResponseBody getBody() {
        return this.body;
    }

}
