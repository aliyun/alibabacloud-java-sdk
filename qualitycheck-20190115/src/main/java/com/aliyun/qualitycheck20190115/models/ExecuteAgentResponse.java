// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ExecuteAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAgentResponseBody body;

    public static ExecuteAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAgentResponse self = new ExecuteAgentResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAgentResponse setBody(ExecuteAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAgentResponseBody getBody() {
        return this.body;
    }

}
