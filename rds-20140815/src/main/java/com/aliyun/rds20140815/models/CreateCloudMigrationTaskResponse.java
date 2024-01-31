// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCloudMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudMigrationTaskResponse setBody(CreateCloudMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
