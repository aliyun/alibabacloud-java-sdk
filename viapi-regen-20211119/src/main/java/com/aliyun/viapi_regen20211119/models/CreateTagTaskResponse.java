// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateTagTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTagTaskResponseBody body;

    public static CreateTagTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagTaskResponse self = new CreateTagTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTagTaskResponse setBody(CreateTagTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagTaskResponseBody getBody() {
        return this.body;
    }

}
