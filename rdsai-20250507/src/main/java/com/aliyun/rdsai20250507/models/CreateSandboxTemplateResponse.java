// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSandboxTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSandboxTemplateResponseBody body;

    public static CreateSandboxTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxTemplateResponse self = new CreateSandboxTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSandboxTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSandboxTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSandboxTemplateResponse setBody(CreateSandboxTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSandboxTemplateResponseBody getBody() {
        return this.body;
    }

}
