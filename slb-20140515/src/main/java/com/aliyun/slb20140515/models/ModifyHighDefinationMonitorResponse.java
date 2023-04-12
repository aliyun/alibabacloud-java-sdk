// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyHighDefinationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHighDefinationMonitorResponseBody body;

    public static ModifyHighDefinationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHighDefinationMonitorResponse self = new ModifyHighDefinationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHighDefinationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHighDefinationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHighDefinationMonitorResponse setBody(ModifyHighDefinationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHighDefinationMonitorResponseBody getBody() {
        return this.body;
    }

}
