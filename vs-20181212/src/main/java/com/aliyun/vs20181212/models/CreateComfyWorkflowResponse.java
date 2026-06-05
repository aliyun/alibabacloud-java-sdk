// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComfyWorkflowResponseBody body;

    public static CreateComfyWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyWorkflowResponse self = new CreateComfyWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public CreateComfyWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComfyWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComfyWorkflowResponse setBody(CreateComfyWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComfyWorkflowResponseBody getBody() {
        return this.body;
    }

}
