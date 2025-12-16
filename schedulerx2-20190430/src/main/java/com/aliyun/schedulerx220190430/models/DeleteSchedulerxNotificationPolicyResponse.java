// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteSchedulerxNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchedulerxNotificationPolicyResponseBody body;

    public static DeleteSchedulerxNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerxNotificationPolicyResponse self = new DeleteSchedulerxNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerxNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchedulerxNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchedulerxNotificationPolicyResponse setBody(DeleteSchedulerxNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedulerxNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
