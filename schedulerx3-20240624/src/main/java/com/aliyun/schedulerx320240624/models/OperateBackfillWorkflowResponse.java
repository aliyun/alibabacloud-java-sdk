// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateBackfillWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateBackfillWorkflowResponseBody body;

    public static OperateBackfillWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBackfillWorkflowResponse self = new OperateBackfillWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public OperateBackfillWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateBackfillWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateBackfillWorkflowResponse setBody(OperateBackfillWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateBackfillWorkflowResponseBody getBody() {
        return this.body;
    }

}
