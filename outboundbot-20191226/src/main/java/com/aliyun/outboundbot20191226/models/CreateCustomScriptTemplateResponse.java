// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateCustomScriptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomScriptTemplateResponseBody body;

    public static CreateCustomScriptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomScriptTemplateResponse self = new CreateCustomScriptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomScriptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomScriptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomScriptTemplateResponse setBody(CreateCustomScriptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomScriptTemplateResponseBody getBody() {
        return this.body;
    }

}
