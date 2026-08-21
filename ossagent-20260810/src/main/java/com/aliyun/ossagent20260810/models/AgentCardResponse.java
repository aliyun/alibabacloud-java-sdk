// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260810.models;

import com.aliyun.tea.*;

public class AgentCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Object body;

    public static AgentCardResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentCardResponse self = new AgentCardResponse();
        return TeaModel.build(map, self);
    }

    public AgentCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentCardResponse setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
