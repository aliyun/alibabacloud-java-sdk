// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteWorkflowResponseBody body;

    public static ExecuteWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteWorkflowResponse self = new ExecuteWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteWorkflowResponse setBody(ExecuteWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteWorkflowResponseBody getBody() {
        return this.body;
    }

}
