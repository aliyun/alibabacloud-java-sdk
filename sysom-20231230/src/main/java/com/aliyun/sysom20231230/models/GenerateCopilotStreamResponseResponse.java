// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotStreamResponseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCopilotStreamResponseResponseBody body;

    public static GenerateCopilotStreamResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotStreamResponseResponse self = new GenerateCopilotStreamResponseResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotStreamResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCopilotStreamResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCopilotStreamResponseResponse setBody(GenerateCopilotStreamResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCopilotStreamResponseResponseBody getBody() {
        return this.body;
    }

}
