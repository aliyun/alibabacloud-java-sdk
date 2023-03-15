// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorSlsAlertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorSlsAlerts body;

    public static CreateMonitorSlsAlertsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorSlsAlertsResponse self = new CreateMonitorSlsAlertsResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorSlsAlertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorSlsAlertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorSlsAlertsResponse setBody(MonitorSlsAlerts body) {
        this.body = body;
        return this;
    }
    public MonitorSlsAlerts getBody() {
        return this.body;
    }

}
