// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorMqAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorMqAlert body;

    public static UpdateMonitorMqAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorMqAlertResponse self = new UpdateMonitorMqAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorMqAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorMqAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorMqAlertResponse setBody(MonitorMqAlert body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlert getBody() {
        return this.body;
    }

}
