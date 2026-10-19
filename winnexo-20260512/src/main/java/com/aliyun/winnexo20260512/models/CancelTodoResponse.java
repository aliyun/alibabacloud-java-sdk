// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CancelTodoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelTodoResponseBody body;

    public static CancelTodoResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTodoResponse self = new CancelTodoResponse();
        return TeaModel.build(map, self);
    }

    public CancelTodoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTodoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelTodoResponse setBody(CancelTodoResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTodoResponseBody getBody() {
        return this.body;
    }

}
