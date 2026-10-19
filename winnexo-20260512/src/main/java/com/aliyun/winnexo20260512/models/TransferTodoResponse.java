// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TransferTodoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferTodoResponseBody body;

    public static TransferTodoResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferTodoResponse self = new TransferTodoResponse();
        return TeaModel.build(map, self);
    }

    public TransferTodoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferTodoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferTodoResponse setBody(TransferTodoResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferTodoResponseBody getBody() {
        return this.body;
    }

}
