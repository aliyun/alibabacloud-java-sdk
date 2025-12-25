// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDisableWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateDisableWorkflowsResponseBody body;

    public static OperateDisableWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateDisableWorkflowsResponse self = new OperateDisableWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public OperateDisableWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateDisableWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateDisableWorkflowsResponse setBody(OperateDisableWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateDisableWorkflowsResponseBody getBody() {
        return this.body;
    }

}
