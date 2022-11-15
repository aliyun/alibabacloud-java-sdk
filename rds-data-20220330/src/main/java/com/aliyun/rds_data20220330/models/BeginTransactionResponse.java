// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BeginTransactionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BeginTransactionResponseBody body;

    public static BeginTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        BeginTransactionResponse self = new BeginTransactionResponse();
        return TeaModel.build(map, self);
    }

    public BeginTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeginTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeginTransactionResponse setBody(BeginTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public BeginTransactionResponseBody getBody() {
        return this.body;
    }

}
