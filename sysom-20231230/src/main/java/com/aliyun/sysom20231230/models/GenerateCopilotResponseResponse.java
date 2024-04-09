// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotResponseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCopilotResponseResponseBody body;

    public static GenerateCopilotResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotResponseResponse self = new GenerateCopilotResponseResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCopilotResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCopilotResponseResponse setBody(GenerateCopilotResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCopilotResponseResponseBody getBody() {
        return this.body;
    }

}
