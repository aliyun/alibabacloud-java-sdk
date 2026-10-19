// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowTemplateResponseBody body;

    public static GetWorkflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTemplateResponse self = new GetWorkflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowTemplateResponse setBody(GetWorkflowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowTemplateResponseBody getBody() {
        return this.body;
    }

}
