// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class CreateModelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelTaskResponseBody body;

    public static CreateModelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTaskResponse self = new CreateModelTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelTaskResponse setBody(CreateModelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelTaskResponseBody getBody() {
        return this.body;
    }

}
