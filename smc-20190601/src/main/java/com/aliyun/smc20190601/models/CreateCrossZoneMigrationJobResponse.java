// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateCrossZoneMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCrossZoneMigrationJobResponseBody body;

    public static CreateCrossZoneMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossZoneMigrationJobResponse self = new CreateCrossZoneMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateCrossZoneMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCrossZoneMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCrossZoneMigrationJobResponse setBody(CreateCrossZoneMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCrossZoneMigrationJobResponseBody getBody() {
        return this.body;
    }

}
