// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowTemplateVersionsResponseBody body;

    public static ListWorkflowTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTemplateVersionsResponse self = new ListWorkflowTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowTemplateVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowTemplateVersionsResponse setBody(ListWorkflowTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
