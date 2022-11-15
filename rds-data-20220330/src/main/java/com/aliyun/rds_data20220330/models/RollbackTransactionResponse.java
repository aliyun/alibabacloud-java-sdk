// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class RollbackTransactionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackTransactionResponseBody body;

    public static RollbackTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackTransactionResponse self = new RollbackTransactionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackTransactionResponse setBody(RollbackTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackTransactionResponseBody getBody() {
        return this.body;
    }

}
