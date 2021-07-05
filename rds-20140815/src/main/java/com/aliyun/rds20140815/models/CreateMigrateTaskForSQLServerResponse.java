// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMigrateTaskForSQLServerResponseBody body;

    public static CreateMigrateTaskForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerResponse self = new CreateMigrateTaskForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskForSQLServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrateTaskForSQLServerResponse setBody(CreateMigrateTaskForSQLServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrateTaskForSQLServerResponseBody getBody() {
        return this.body;
    }

}
