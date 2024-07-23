// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateSqlStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateSqlStatementResponseBody body;

    public static ValidateSqlStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlStatementResponse self = new ValidateSqlStatementResponse();
        return TeaModel.build(map, self);
    }

    public ValidateSqlStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateSqlStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateSqlStatementResponse setBody(ValidateSqlStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateSqlStatementResponseBody getBody() {
        return this.body;
    }

}
