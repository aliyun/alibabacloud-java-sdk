// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageSchedulerxNotificationPolicyResponseBody body;

    public static ManageSchedulerxNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxNotificationPolicyResponse self = new ManageSchedulerxNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageSchedulerxNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageSchedulerxNotificationPolicyResponse setBody(ManageSchedulerxNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageSchedulerxNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
