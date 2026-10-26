// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentConversationResponseBody body;

    public static UpdateAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationResponse self = new UpdateAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentConversationResponse setBody(UpdateAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentConversationResponseBody getBody() {
        return this.body;
    }

}
