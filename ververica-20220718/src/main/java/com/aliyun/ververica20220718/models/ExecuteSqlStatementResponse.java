// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExecuteSqlStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSqlStatementResponseBody body;

    public static ExecuteSqlStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlStatementResponse self = new ExecuteSqlStatementResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSqlStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSqlStatementResponse setBody(ExecuteSqlStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSqlStatementResponseBody getBody() {
        return this.body;
    }

}
