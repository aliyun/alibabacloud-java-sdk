// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListAgentConversationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentConversationsResponseBody body;

    public static ListAgentConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentConversationsResponse self = new ListAgentConversationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentConversationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentConversationsResponse setBody(ListAgentConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentConversationsResponseBody getBody() {
        return this.body;
    }

}
