// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAgentConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentConfigResponseBody body;

    public static CreateAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConfigResponse self = new CreateAgentConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentConfigResponse setBody(CreateAgentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentConfigResponseBody getBody() {
        return this.body;
    }

}
