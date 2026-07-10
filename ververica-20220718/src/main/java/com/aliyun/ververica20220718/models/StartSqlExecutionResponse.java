// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSqlExecutionResponseBody body;

    public static StartSqlExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSqlExecutionResponse self = new StartSqlExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartSqlExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSqlExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSqlExecutionResponse setBody(StartSqlExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSqlExecutionResponseBody getBody() {
        return this.body;
    }

}
