// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SetHighDefinitionMonitorLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHighDefinitionMonitorLogStatusResponseBody body;

    public static SetHighDefinitionMonitorLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHighDefinitionMonitorLogStatusResponse self = new SetHighDefinitionMonitorLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetHighDefinitionMonitorLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHighDefinitionMonitorLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHighDefinitionMonitorLogStatusResponse setBody(SetHighDefinitionMonitorLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHighDefinitionMonitorLogStatusResponseBody getBody() {
        return this.body;
    }

}
