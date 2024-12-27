// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentTaskResponseBody body;

    public static GetAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResponse self = new GetAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentTaskResponse setBody(GetAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentTaskResponseBody getBody() {
        return this.body;
    }

}
