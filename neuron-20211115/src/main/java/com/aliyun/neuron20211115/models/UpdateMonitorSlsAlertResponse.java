// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorSlsAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorSlsAlert body;

    public static UpdateMonitorSlsAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorSlsAlertResponse self = new UpdateMonitorSlsAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorSlsAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorSlsAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorSlsAlertResponse setBody(MonitorSlsAlert body) {
        this.body = body;
        return this;
    }
    public MonitorSlsAlert getBody() {
        return this.body;
    }

}
