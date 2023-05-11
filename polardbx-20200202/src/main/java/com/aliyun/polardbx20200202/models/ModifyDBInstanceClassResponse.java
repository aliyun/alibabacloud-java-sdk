// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceClassResponseBody body;

    public static ModifyDBInstanceClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassResponse self = new ModifyDBInstanceClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceClassResponse setBody(ModifyDBInstanceClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceClassResponseBody getBody() {
        return this.body;
    }

}
