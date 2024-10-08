// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ExecuteSQLQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSQLQueryResponseBody body;

    public static ExecuteSQLQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSQLQueryResponse self = new ExecuteSQLQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSQLQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSQLQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSQLQueryResponse setBody(ExecuteSQLQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSQLQueryResponseBody getBody() {
        return this.body;
    }

}
