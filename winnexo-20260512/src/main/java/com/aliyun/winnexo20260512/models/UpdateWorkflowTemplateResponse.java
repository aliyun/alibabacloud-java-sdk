// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowTemplateResponseBody body;

    public static UpdateWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowTemplateResponse self = new UpdateWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowTemplateResponse setBody(UpdateWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
