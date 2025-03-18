// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithWebhookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunNotifyComponentWithWebhookResponseBody body;

    public static RunNotifyComponentWithWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithWebhookResponse self = new RunNotifyComponentWithWebhookResponse();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunNotifyComponentWithWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunNotifyComponentWithWebhookResponse setBody(RunNotifyComponentWithWebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public RunNotifyComponentWithWebhookResponseBody getBody() {
        return this.body;
    }

}
