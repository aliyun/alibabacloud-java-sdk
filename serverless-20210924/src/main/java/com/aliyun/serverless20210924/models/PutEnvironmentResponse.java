// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Environment body;

    public static PutEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentResponse self = new PutEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEnvironmentResponse setBody(Environment body) {
        this.body = body;
        return this;
    }
    public Environment getBody() {
        return this.body;
    }

}
