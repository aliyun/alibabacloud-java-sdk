// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class StopAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAgentConversationResponseBody body;

    public static StopAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAgentConversationResponse self = new StopAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public StopAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAgentConversationResponse setBody(StopAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAgentConversationResponseBody getBody() {
        return this.body;
    }

}
