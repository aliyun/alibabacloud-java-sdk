// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesTaskStopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatMessagesTaskStopResponseBody body;

    public static ChatMessagesTaskStopResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesTaskStopResponse self = new ChatMessagesTaskStopResponse();
        return TeaModel.build(map, self);
    }

    public ChatMessagesTaskStopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatMessagesTaskStopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatMessagesTaskStopResponse setBody(ChatMessagesTaskStopResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatMessagesTaskStopResponseBody getBody() {
        return this.body;
    }

}
