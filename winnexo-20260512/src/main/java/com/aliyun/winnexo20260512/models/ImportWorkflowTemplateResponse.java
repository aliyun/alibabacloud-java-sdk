// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ImportWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportWorkflowTemplateResponseBody body;

    public static ImportWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowTemplateResponse self = new ImportWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportWorkflowTemplateResponse setBody(ImportWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
