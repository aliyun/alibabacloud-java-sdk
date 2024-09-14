// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScheduledPlanResponseBody body;

    public static DeleteScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPlanResponse self = new DeleteScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduledPlanResponse setBody(DeleteScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
