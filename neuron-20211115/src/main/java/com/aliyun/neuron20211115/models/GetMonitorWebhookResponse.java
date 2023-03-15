// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetMonitorWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorWebhook body;

    public static GetMonitorWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorWebhookResponse self = new GetMonitorWebhookResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorWebhookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonitorWebhookResponse setBody(MonitorWebhook body) {
        this.body = body;
        return this;
    }
    public MonitorWebhook getBody() {
        return this.body;
    }

}
