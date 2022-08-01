// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterMonitorResponseBody body;

    public static ModifyDBClusterMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMonitorResponse self = new ModifyDBClusterMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterMonitorResponse setBody(ModifyDBClusterMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterMonitorResponseBody getBody() {
        return this.body;
    }

}
