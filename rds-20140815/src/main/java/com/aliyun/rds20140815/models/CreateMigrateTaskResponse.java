// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMigrateTaskResponse setBody(CreateMigrateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrateTaskResponseBody getBody() {
        return this.body;
    }

}
