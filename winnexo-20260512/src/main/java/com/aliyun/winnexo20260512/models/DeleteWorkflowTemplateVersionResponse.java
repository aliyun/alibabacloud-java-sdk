// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteWorkflowTemplateVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkflowTemplateVersionResponseBody body;

    public static DeleteWorkflowTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowTemplateVersionResponse self = new DeleteWorkflowTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowTemplateVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowTemplateVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkflowTemplateVersionResponse setBody(DeleteWorkflowTemplateVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowTemplateVersionResponseBody getBody() {
        return this.body;
    }

}
