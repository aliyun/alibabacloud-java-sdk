// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationShareScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentConversationShareScopeResponseBody body;

    public static UpdateAgentConversationShareScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationShareScopeResponse self = new UpdateAgentConversationShareScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationShareScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentConversationShareScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentConversationShareScopeResponse setBody(UpdateAgentConversationShareScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentConversationShareScopeResponseBody getBody() {
        return this.body;
    }

}
