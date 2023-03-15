// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorWebhook body;

    public static CreateMonitorWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorWebhookResponse self = new CreateMonitorWebhookResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorWebhookResponse setBody(MonitorWebhook body) {
        this.body = body;
        return this;
    }
    public MonitorWebhook getBody() {
        return this.body;
    }

}
