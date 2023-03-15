// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetMonitorContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorContact body;

    public static GetMonitorContactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorContactResponse self = new GetMonitorContactResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonitorContactResponse setBody(MonitorContact body) {
        this.body = body;
        return this;
    }
    public MonitorContact getBody() {
        return this.body;
    }

}
