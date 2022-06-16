// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppEnvironmentResponseBody body;

    public static DeleteAppEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppEnvironmentResponse self = new DeleteAppEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppEnvironmentResponse setBody(DeleteAppEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppEnvironmentResponseBody getBody() {
        return this.body;
    }

}
