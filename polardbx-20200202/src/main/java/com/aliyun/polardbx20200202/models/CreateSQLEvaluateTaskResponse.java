// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSQLEvaluateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSQLEvaluateTaskResponseBody body;

    public static CreateSQLEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLEvaluateTaskResponse self = new CreateSQLEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSQLEvaluateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSQLEvaluateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSQLEvaluateTaskResponse setBody(CreateSQLEvaluateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSQLEvaluateTaskResponseBody getBody() {
        return this.body;
    }

}
