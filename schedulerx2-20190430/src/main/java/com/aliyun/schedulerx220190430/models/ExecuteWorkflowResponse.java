// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ExecuteWorkflowResponse setBody(ExecuteWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteWorkflowResponseBody getBody() {
        return this.body;
    }

}
