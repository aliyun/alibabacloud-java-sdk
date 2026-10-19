// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowTemplatesResponseBody body;

    public static ListWorkflowTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTemplatesResponse self = new ListWorkflowTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowTemplatesResponse setBody(ListWorkflowTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowTemplatesResponseBody getBody() {
        return this.body;
    }

}
