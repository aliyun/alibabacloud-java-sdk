// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceConnectionModeResponseBody body;

    public static ModifyDBInstanceConnectionModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeResponse self = new ModifyDBInstanceConnectionModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceConnectionModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceConnectionModeResponse setBody(ModifyDBInstanceConnectionModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceConnectionModeResponseBody getBody() {
        return this.body;
    }

}
