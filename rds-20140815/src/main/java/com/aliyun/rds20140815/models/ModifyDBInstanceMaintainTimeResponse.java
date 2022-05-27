// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMaintainTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceMaintainTimeResponseBody body;

    public static ModifyDBInstanceMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMaintainTimeResponse self = new ModifyDBInstanceMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMaintainTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceMaintainTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceMaintainTimeResponse setBody(ModifyDBInstanceMaintainTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceMaintainTimeResponseBody getBody() {
        return this.body;
    }

}
