// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopApplyScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopApplyScheduledPlanResponseBody body;

    public static StopApplyScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        StopApplyScheduledPlanResponse self = new StopApplyScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public StopApplyScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopApplyScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopApplyScheduledPlanResponse setBody(StopApplyScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public StopApplyScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
