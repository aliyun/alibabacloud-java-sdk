// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMigrateTaskResponseBody body;

    public static CreateMigrateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskResponse self = new CreateMigrateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMigrateTaskResponse setBody(CreateMigrateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrateTaskResponseBody getBody() {
        return this.body;
    }

}
