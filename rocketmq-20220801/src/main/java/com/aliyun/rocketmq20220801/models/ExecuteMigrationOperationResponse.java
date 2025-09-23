// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ExecuteMigrationOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteMigrationOperationResponseBody body;

    public static ExecuteMigrationOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMigrationOperationResponse self = new ExecuteMigrationOperationResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteMigrationOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteMigrationOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteMigrationOperationResponse setBody(ExecuteMigrationOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteMigrationOperationResponseBody getBody() {
        return this.body;
    }

}
