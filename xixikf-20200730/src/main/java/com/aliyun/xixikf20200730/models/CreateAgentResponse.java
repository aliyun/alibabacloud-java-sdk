// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAgentResponseBody body;

    public static CreateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponse self = new CreateAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentResponse setBody(CreateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentResponseBody getBody() {
        return this.body;
    }

}
