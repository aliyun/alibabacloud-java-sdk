// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentSsoLoginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppAssistantAgentSsoLoginResponseBody body;

    public static CreateAppAssistantAgentSsoLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentSsoLoginResponse self = new CreateAppAssistantAgentSsoLoginResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentSsoLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppAssistantAgentSsoLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppAssistantAgentSsoLoginResponse setBody(CreateAppAssistantAgentSsoLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppAssistantAgentSsoLoginResponseBody getBody() {
        return this.body;
    }

}
