// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorMqAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorMqAlert body;

    public static CreateMonitorMqAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorMqAlertResponse self = new CreateMonitorMqAlertResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorMqAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorMqAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorMqAlertResponse setBody(MonitorMqAlert body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlert getBody() {
        return this.body;
    }

}
