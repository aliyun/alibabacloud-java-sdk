// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteMultiAccountSQLQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteMultiAccountSQLQueryResponseBody body;

    public static ExecuteMultiAccountSQLQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMultiAccountSQLQueryResponse self = new ExecuteMultiAccountSQLQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteMultiAccountSQLQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteMultiAccountSQLQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteMultiAccountSQLQueryResponse setBody(ExecuteMultiAccountSQLQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteMultiAccountSQLQueryResponseBody getBody() {
        return this.body;
    }

}
