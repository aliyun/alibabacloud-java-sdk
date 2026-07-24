// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopSqlExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSqlExecutionResponseBody body;

    public static StopSqlExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSqlExecutionResponse self = new StopSqlExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StopSqlExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSqlExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSqlExecutionResponse setBody(StopSqlExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSqlExecutionResponseBody getBody() {
        return this.body;
    }

}
