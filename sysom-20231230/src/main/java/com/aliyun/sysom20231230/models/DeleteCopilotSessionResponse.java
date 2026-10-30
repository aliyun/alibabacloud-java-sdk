// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteCopilotSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCopilotSessionResponseBody body;

    public static DeleteCopilotSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopilotSessionResponse self = new DeleteCopilotSessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCopilotSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCopilotSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCopilotSessionResponse setBody(DeleteCopilotSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCopilotSessionResponseBody getBody() {
        return this.body;
    }

}
