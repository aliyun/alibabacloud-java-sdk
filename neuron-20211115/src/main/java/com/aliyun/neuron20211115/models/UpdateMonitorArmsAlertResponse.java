// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorArmsAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorArmsAlert body;

    public static UpdateMonitorArmsAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorArmsAlertResponse self = new UpdateMonitorArmsAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorArmsAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorArmsAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorArmsAlertResponse setBody(MonitorArmsAlert body) {
        this.body = body;
        return this;
    }
    public MonitorArmsAlert getBody() {
        return this.body;
    }

}
