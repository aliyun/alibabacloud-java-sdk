// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ChatAiAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatAiAgentResponseBody body;

    public static ChatAiAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatAiAgentResponse self = new ChatAiAgentResponse();
        return TeaModel.build(map, self);
    }

    public ChatAiAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatAiAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatAiAgentResponse setBody(ChatAiAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatAiAgentResponseBody getBody() {
        return this.body;
    }

}
