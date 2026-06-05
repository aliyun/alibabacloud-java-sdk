// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyComfyWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyComfyWorkflowResponseBody body;

    public static ModifyComfyWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyComfyWorkflowResponse self = new ModifyComfyWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public ModifyComfyWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyComfyWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyComfyWorkflowResponse setBody(ModifyComfyWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyComfyWorkflowResponseBody getBody() {
        return this.body;
    }

}
