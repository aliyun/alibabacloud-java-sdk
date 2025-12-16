// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxNotificationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadSchedulerxNotificationPolicyResponseBody body;

    public static ReadSchedulerxNotificationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxNotificationPolicyResponse self = new ReadSchedulerxNotificationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxNotificationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadSchedulerxNotificationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadSchedulerxNotificationPolicyResponse setBody(ReadSchedulerxNotificationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadSchedulerxNotificationPolicyResponseBody getBody() {
        return this.body;
    }

}
