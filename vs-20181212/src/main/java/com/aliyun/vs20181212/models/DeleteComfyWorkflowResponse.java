// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteComfyWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComfyWorkflowResponseBody body;

    public static DeleteComfyWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComfyWorkflowResponse self = new DeleteComfyWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComfyWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComfyWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComfyWorkflowResponse setBody(DeleteComfyWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComfyWorkflowResponseBody getBody() {
        return this.body;
    }

}
