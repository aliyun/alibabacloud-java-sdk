// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCloudMigrationTaskResponseBody body;

    public static CreateCloudMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationTaskResponse self = new CreateCloudMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudMigrationTaskResponse setBody(CreateCloudMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
