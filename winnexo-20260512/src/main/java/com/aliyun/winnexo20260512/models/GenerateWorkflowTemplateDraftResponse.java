// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GenerateWorkflowTemplateDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateWorkflowTemplateDraftResponseBody body;

    public static GenerateWorkflowTemplateDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWorkflowTemplateDraftResponse self = new GenerateWorkflowTemplateDraftResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWorkflowTemplateDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWorkflowTemplateDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateWorkflowTemplateDraftResponse setBody(GenerateWorkflowTemplateDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWorkflowTemplateDraftResponseBody getBody() {
        return this.body;
    }

}
