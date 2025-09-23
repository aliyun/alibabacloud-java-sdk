// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class FinishMigrationStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishMigrationStageResponseBody body;

    public static FinishMigrationStageResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishMigrationStageResponse self = new FinishMigrationStageResponse();
        return TeaModel.build(map, self);
    }

    public FinishMigrationStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishMigrationStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishMigrationStageResponse setBody(FinishMigrationStageResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishMigrationStageResponseBody getBody() {
        return this.body;
    }

}
