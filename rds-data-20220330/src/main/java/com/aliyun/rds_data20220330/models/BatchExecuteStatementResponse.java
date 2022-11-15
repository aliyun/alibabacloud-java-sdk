// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BatchExecuteStatementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchExecuteStatementResponseBody body;

    public static BatchExecuteStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchExecuteStatementResponse self = new BatchExecuteStatementResponse();
        return TeaModel.build(map, self);
    }

    public BatchExecuteStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchExecuteStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchExecuteStatementResponse setBody(BatchExecuteStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchExecuteStatementResponseBody getBody() {
        return this.body;
    }

}
