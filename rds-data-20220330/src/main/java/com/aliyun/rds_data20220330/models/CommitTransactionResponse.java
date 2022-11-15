// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class CommitTransactionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CommitTransactionResponseBody body;

    public static CommitTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitTransactionResponse self = new CommitTransactionResponse();
        return TeaModel.build(map, self);
    }

    public CommitTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitTransactionResponse setBody(CommitTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitTransactionResponseBody getBody() {
        return this.body;
    }

}
