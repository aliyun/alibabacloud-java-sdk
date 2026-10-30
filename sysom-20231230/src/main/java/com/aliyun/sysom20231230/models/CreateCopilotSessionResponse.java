// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateCopilotSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCopilotSessionResponseBody body;

    public static CreateCopilotSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotSessionResponse self = new CreateCopilotSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateCopilotSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCopilotSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCopilotSessionResponse setBody(CreateCopilotSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCopilotSessionResponseBody getBody() {
        return this.body;
    }

}
