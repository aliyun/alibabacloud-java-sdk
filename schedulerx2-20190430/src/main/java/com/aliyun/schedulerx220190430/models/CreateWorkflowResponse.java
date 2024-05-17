// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowResponseBody body;

    public static CreateWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowResponse self = new CreateWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowResponse setBody(CreateWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowResponseBody getBody() {
        return this.body;
    }

}
