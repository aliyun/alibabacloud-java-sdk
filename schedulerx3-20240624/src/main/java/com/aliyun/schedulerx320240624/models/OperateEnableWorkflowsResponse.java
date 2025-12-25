// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateEnableWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateEnableWorkflowsResponseBody body;

    public static OperateEnableWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateEnableWorkflowsResponse self = new OperateEnableWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public OperateEnableWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateEnableWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateEnableWorkflowsResponse setBody(OperateEnableWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateEnableWorkflowsResponseBody getBody() {
        return this.body;
    }

}
