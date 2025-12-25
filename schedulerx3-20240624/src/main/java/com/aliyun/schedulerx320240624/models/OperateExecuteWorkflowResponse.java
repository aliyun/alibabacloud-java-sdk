// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateExecuteWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateExecuteWorkflowResponseBody body;

    public static OperateExecuteWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateExecuteWorkflowResponse self = new OperateExecuteWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public OperateExecuteWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateExecuteWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateExecuteWorkflowResponse setBody(OperateExecuteWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateExecuteWorkflowResponseBody getBody() {
        return this.body;
    }

}
