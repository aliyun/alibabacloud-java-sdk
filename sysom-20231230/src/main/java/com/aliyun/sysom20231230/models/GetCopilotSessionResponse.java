// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCopilotSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCopilotSessionResponseBody body;

    public static GetCopilotSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotSessionResponse self = new GetCopilotSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetCopilotSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopilotSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopilotSessionResponse setBody(GetCopilotSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopilotSessionResponseBody getBody() {
        return this.body;
    }

}
