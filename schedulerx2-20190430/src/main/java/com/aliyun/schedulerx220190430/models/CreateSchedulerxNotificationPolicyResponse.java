// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateSchedulerxNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSchedulerxNotificationPolicyResponseBody body;

    public static CreateSchedulerxNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerxNotificationPolicyResponse self = new CreateSchedulerxNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerxNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchedulerxNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSchedulerxNotificationPolicyResponse setBody(CreateSchedulerxNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchedulerxNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
