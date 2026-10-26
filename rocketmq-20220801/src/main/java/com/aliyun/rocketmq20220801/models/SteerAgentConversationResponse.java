// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class SteerAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SteerAgentConversationResponseBody body;

    public static SteerAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        SteerAgentConversationResponse self = new SteerAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public SteerAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SteerAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SteerAgentConversationResponse setBody(SteerAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public SteerAgentConversationResponseBody getBody() {
        return this.body;
    }

}
