// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorContact body;

    public static UpdateMonitorContactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorContactResponse self = new UpdateMonitorContactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorContactResponse setBody(MonitorContact body) {
        this.body = body;
        return this;
    }
    public MonitorContact getBody() {
        return this.body;
    }

}
