// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationPrecheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudMigrationPrecheckTaskResponseBody body;

    public static CreateCloudMigrationPrecheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationPrecheckTaskResponse self = new CreateCloudMigrationPrecheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationPrecheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudMigrationPrecheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudMigrationPrecheckTaskResponse setBody(CreateCloudMigrationPrecheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudMigrationPrecheckTaskResponseBody getBody() {
        return this.body;
    }

}
