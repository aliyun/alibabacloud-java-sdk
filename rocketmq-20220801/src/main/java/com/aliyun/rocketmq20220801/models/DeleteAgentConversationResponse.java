// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentConversationResponseBody body;

    public static DeleteAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentConversationResponse self = new DeleteAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentConversationResponse setBody(DeleteAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentConversationResponseBody getBody() {
        return this.body;
    }

}
