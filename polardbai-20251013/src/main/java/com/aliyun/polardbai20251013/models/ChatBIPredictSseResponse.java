// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPredictSseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatBIPredictSseResponseBody body;

    public static ChatBIPredictSseResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPredictSseResponse self = new ChatBIPredictSseResponse();
        return TeaModel.build(map, self);
    }

    public ChatBIPredictSseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatBIPredictSseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatBIPredictSseResponse setBody(ChatBIPredictSseResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatBIPredictSseResponseBody getBody() {
        return this.body;
    }

}
