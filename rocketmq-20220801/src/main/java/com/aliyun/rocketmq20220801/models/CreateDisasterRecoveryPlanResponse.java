// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateDisasterRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDisasterRecoveryPlanResponseBody body;

    public static CreateDisasterRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDisasterRecoveryPlanResponse self = new CreateDisasterRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDisasterRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDisasterRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDisasterRecoveryPlanResponse setBody(CreateDisasterRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDisasterRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
