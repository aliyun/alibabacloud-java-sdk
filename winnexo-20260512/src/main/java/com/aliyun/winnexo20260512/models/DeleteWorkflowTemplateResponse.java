// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkflowTemplateResponseBody body;

    public static DeleteWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowTemplateResponse self = new DeleteWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkflowTemplateResponse setBody(DeleteWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
