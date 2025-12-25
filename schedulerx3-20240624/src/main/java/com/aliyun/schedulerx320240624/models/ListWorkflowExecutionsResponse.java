// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowExecutionsResponseBody body;

    public static ListWorkflowExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowExecutionsResponse self = new ListWorkflowExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowExecutionsResponse setBody(ListWorkflowExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

}
