// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceMetricsResponseBody body;

    public static ModifyDBInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMetricsResponse self = new ModifyDBInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceMetricsResponse setBody(ModifyDBInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
