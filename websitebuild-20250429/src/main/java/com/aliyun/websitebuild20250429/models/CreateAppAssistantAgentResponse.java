// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppAssistantAgentResponseBody body;

    public static CreateAppAssistantAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentResponse self = new CreateAppAssistantAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppAssistantAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppAssistantAgentResponse setBody(CreateAppAssistantAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppAssistantAgentResponseBody getBody() {
        return this.body;
    }

}
