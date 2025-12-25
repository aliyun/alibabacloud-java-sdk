// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRetryWorkflowExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateRetryWorkflowExecutionResponseBody body;

    public static OperateRetryWorkflowExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateRetryWorkflowExecutionResponse self = new OperateRetryWorkflowExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateRetryWorkflowExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateRetryWorkflowExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateRetryWorkflowExecutionResponse setBody(OperateRetryWorkflowExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateRetryWorkflowExecutionResponseBody getBody() {
        return this.body;
    }

}
