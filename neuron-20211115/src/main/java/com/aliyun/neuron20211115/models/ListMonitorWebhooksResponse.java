// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMonitorWebhooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorWebhookPageResult body;

    public static ListMonitorWebhooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorWebhooksResponse self = new ListMonitorWebhooksResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorWebhooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonitorWebhooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMonitorWebhooksResponse setBody(MonitorWebhookPageResult body) {
        this.body = body;
        return this;
    }
    public MonitorWebhookPageResult getBody() {
        return this.body;
    }

}
