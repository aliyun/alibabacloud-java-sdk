// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyUserDataDirResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComfyUserDataDirResponseBody body;

    public static CreateComfyUserDataDirResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyUserDataDirResponse self = new CreateComfyUserDataDirResponse();
        return TeaModel.build(map, self);
    }

    public CreateComfyUserDataDirResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComfyUserDataDirResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComfyUserDataDirResponse setBody(CreateComfyUserDataDirResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComfyUserDataDirResponseBody getBody() {
        return this.body;
    }

}
