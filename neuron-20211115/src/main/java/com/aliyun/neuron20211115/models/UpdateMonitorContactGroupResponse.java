// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorContactGroup body;

    public static UpdateMonitorContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorContactGroupResponse self = new UpdateMonitorContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorContactGroupResponse setBody(MonitorContactGroup body) {
        this.body = body;
        return this;
    }
    public MonitorContactGroup getBody() {
        return this.body;
    }

}
