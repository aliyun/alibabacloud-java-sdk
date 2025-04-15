// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateDisasterRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDisasterRecoveryPlanResponseBody body;

    public static UpdateDisasterRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisasterRecoveryPlanResponse self = new UpdateDisasterRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDisasterRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDisasterRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDisasterRecoveryPlanResponse setBody(UpdateDisasterRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDisasterRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
