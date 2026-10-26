// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentConversationResponseBody body;

    public static GetAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationResponse self = new GetAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentConversationResponse setBody(GetAgentConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentConversationResponseBody getBody() {
        return this.body;
    }

}
