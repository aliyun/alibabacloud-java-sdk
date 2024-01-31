// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceHAConfigResponseBody body;

    public static ModifyDBInstanceHAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigResponse self = new ModifyDBInstanceHAConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceHAConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceHAConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceHAConfigResponse setBody(ModifyDBInstanceHAConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceHAConfigResponseBody getBody() {
        return this.body;
    }

}
