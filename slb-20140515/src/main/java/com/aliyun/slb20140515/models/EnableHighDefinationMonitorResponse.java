// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class EnableHighDefinationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableHighDefinationMonitorResponseBody body;

    public static EnableHighDefinationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHighDefinationMonitorResponse self = new EnableHighDefinationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public EnableHighDefinationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHighDefinationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHighDefinationMonitorResponse setBody(EnableHighDefinationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHighDefinationMonitorResponseBody getBody() {
        return this.body;
    }

}
