// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTodoResponseBody body;

    public static GetTodoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTodoResponse self = new GetTodoResponse();
        return TeaModel.build(map, self);
    }

    public GetTodoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTodoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTodoResponse setBody(GetTodoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTodoResponseBody getBody() {
        return this.body;
    }

}
