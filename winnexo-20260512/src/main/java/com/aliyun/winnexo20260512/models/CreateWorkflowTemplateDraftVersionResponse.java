// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowTemplateDraftVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowTemplateDraftVersionResponseBody body;

    public static CreateWorkflowTemplateDraftVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowTemplateDraftVersionResponse self = new CreateWorkflowTemplateDraftVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowTemplateDraftVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowTemplateDraftVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowTemplateDraftVersionResponse setBody(CreateWorkflowTemplateDraftVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowTemplateDraftVersionResponseBody getBody() {
        return this.body;
    }

}
