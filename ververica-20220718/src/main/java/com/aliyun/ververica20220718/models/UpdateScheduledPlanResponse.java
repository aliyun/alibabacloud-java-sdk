// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScheduledPlanResponseBody body;

    public static UpdateScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPlanResponse self = new UpdateScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduledPlanResponse setBody(UpdateScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
