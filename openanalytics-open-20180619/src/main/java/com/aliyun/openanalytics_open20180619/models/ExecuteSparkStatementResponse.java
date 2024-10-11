// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ExecuteSparkStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSparkStatementResponseBody body;

    public static ExecuteSparkStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkStatementResponse self = new ExecuteSparkStatementResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSparkStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSparkStatementResponse setBody(ExecuteSparkStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSparkStatementResponseBody getBody() {
        return this.body;
    }

}
