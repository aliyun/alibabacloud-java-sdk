// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentTaskResponseBody body;

    public static CreateAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentTaskResponse self = new CreateAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentTaskResponse setBody(CreateAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentTaskResponseBody getBody() {
        return this.body;
    }

}
