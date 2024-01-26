// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class CreateTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransactionResponseBody body;

    public static CreateTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionResponse self = new CreateTransactionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransactionResponse setBody(CreateTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransactionResponseBody getBody() {
        return this.body;
    }

}
