// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentConversationTimelineResponseBody body;

    public static GetAgentConversationTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationTimelineResponse self = new GetAgentConversationTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentConversationTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentConversationTimelineResponse setBody(GetAgentConversationTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentConversationTimelineResponseBody getBody() {
        return this.body;
    }

}
