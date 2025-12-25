// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateHoldWorkflowExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateHoldWorkflowExecutionResponseBody body;

    public static OperateHoldWorkflowExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateHoldWorkflowExecutionResponse self = new OperateHoldWorkflowExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateHoldWorkflowExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateHoldWorkflowExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateHoldWorkflowExecutionResponse setBody(OperateHoldWorkflowExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateHoldWorkflowExecutionResponseBody getBody() {
        return this.body;
    }

}
