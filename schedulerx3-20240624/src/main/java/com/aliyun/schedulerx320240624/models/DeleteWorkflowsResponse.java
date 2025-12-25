// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkflowsResponseBody body;

    public static DeleteWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowsResponse self = new DeleteWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkflowsResponse setBody(DeleteWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkflowsResponseBody getBody() {
        return this.body;
    }

}
