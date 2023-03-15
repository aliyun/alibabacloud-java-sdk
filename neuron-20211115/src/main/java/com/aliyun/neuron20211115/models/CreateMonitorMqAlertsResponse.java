// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorMqAlertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorMqAlerts body;

    public static CreateMonitorMqAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorMqAlertsResponse self = new CreateMonitorMqAlertsResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorMqAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorMqAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorMqAlertsResponse setBody(MonitorMqAlerts body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlerts getBody() {
        return this.body;
    }

}
