// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ExportWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportWorkflowTemplateResponseBody body;

    public static ExportWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkflowTemplateResponse self = new ExportWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ExportWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportWorkflowTemplateResponse setBody(ExportWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
