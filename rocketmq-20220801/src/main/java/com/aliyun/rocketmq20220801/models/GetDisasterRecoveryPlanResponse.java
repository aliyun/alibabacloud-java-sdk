// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetDisasterRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDisasterRecoveryPlanResponseBody body;

    public static GetDisasterRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDisasterRecoveryPlanResponse self = new GetDisasterRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetDisasterRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDisasterRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDisasterRecoveryPlanResponse setBody(GetDisasterRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDisasterRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
