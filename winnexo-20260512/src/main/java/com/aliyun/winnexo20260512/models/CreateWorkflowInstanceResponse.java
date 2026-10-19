// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowInstanceResponseBody body;

    public static CreateWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstanceResponse self = new CreateWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowInstanceResponse setBody(CreateWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
