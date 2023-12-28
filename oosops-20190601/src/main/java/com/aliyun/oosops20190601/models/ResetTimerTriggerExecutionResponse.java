// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetTimerTriggerExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetTimerTriggerExecutionResponseBody body;

    public static ResetTimerTriggerExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetTimerTriggerExecutionResponse self = new ResetTimerTriggerExecutionResponse();
        return TeaModel.build(map, self);
    }

    public ResetTimerTriggerExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetTimerTriggerExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetTimerTriggerExecutionResponse setBody(ResetTimerTriggerExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetTimerTriggerExecutionResponseBody getBody() {
        return this.body;
    }

}
