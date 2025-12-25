// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateStopWorkflowExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateStopWorkflowExecutionResponseBody body;

    public static OperateStopWorkflowExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateStopWorkflowExecutionResponse self = new OperateStopWorkflowExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateStopWorkflowExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateStopWorkflowExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateStopWorkflowExecutionResponse setBody(OperateStopWorkflowExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateStopWorkflowExecutionResponseBody getBody() {
        return this.body;
    }

}
