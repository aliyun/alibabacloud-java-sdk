// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RespondAgentConversationActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RespondAgentConversationActionResponseBody body;

    public static RespondAgentConversationActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RespondAgentConversationActionResponse self = new RespondAgentConversationActionResponse();
        return TeaModel.build(map, self);
    }

    public RespondAgentConversationActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RespondAgentConversationActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RespondAgentConversationActionResponse setBody(RespondAgentConversationActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RespondAgentConversationActionResponseBody getBody() {
        return this.body;
    }

}
