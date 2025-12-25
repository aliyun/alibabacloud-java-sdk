// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateMarkSuccessWorkflowExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateMarkSuccessWorkflowExecutionResponseBody body;

    public static OperateMarkSuccessWorkflowExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateMarkSuccessWorkflowExecutionResponse self = new OperateMarkSuccessWorkflowExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateMarkSuccessWorkflowExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateMarkSuccessWorkflowExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateMarkSuccessWorkflowExecutionResponse setBody(OperateMarkSuccessWorkflowExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateMarkSuccessWorkflowExecutionResponseBody getBody() {
        return this.body;
    }

}
