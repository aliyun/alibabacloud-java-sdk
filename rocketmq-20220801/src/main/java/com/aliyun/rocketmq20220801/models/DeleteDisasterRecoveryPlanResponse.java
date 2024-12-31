// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteDisasterRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDisasterRecoveryPlanResponseBody body;

    public static DeleteDisasterRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisasterRecoveryPlanResponse self = new DeleteDisasterRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDisasterRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDisasterRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDisasterRecoveryPlanResponse setBody(DeleteDisasterRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDisasterRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
