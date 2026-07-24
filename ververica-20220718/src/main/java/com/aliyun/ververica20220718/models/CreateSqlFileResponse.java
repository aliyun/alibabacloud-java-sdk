// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSqlFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlFileResponseBody body;

    public static CreateSqlFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlFileResponse self = new CreateSqlFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlFileResponse setBody(CreateSqlFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlFileResponseBody getBody() {
        return this.body;
    }

}
