// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTodoResponseBody body;

    public static CreateTodoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoResponse self = new CreateTodoResponse();
        return TeaModel.build(map, self);
    }

    public CreateTodoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTodoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTodoResponse setBody(CreateTodoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTodoResponseBody getBody() {
        return this.body;
    }

}
