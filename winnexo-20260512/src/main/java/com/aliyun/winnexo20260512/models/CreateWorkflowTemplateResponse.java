// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowTemplateResponseBody body;

    public static CreateWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowTemplateResponse self = new CreateWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowTemplateResponse setBody(CreateWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
