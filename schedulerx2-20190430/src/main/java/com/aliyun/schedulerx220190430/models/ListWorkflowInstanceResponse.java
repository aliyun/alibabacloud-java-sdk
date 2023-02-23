// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkflowInstanceResponseBody body;

    public static ListWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstanceResponse self = new ListWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowInstanceResponse setBody(ListWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
