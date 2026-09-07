// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasclaw20260626.models;

import com.aliyun.tea.*;

public class ChatUserSecAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public String body;

    public static ChatUserSecAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatUserSecAgentResponse self = new ChatUserSecAgentResponse();
        return TeaModel.build(map, self);
    }

    public ChatUserSecAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatUserSecAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatUserSecAgentResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
