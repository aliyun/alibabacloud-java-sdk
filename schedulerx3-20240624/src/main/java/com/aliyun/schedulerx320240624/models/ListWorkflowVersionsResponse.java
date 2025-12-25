// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowVersionsResponseBody body;

    public static ListWorkflowVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowVersionsResponse self = new ListWorkflowVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowVersionsResponse setBody(ListWorkflowVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowVersionsResponseBody getBody() {
        return this.body;
    }

}
