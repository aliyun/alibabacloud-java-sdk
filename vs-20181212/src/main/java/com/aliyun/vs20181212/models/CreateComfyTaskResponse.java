// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComfyTaskResponseBody body;

    public static CreateComfyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyTaskResponse self = new CreateComfyTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateComfyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComfyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComfyTaskResponse setBody(CreateComfyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComfyTaskResponseBody getBody() {
        return this.body;
    }

}
