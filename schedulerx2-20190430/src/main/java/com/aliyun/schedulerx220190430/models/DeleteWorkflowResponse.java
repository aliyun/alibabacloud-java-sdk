// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkflowResponseBody body;

    public static DeleteWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowResponse self = new DeleteWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkflowResponse setBody(DeleteWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowResponseBody getBody() {
        return this.body;
    }

}
