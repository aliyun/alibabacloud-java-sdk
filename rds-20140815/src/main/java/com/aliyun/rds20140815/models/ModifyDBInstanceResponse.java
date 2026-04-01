// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceResponseBody body;

    public static ModifyDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceResponse self = new ModifyDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceResponse setBody(ModifyDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceResponseBody getBody() {
        return this.body;
    }

}
