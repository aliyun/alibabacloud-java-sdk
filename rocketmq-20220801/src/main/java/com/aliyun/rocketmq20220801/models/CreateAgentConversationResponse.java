// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentConversationResponseBody body;

    public static CreateAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConversationResponse self = new CreateAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentConversationResponse setBody(CreateAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentConversationResponseBody getBody() {
        return this.body;
    }

}
