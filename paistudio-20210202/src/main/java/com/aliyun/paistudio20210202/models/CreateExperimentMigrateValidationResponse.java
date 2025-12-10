// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentMigrateValidationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentMigrateValidationResponseBody body;

    public static CreateExperimentMigrateValidationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentMigrateValidationResponse self = new CreateExperimentMigrateValidationResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentMigrateValidationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentMigrateValidationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentMigrateValidationResponse setBody(CreateExperimentMigrateValidationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentMigrateValidationResponseBody getBody() {
        return this.body;
    }

}
