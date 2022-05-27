// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceDeletionProtectionResponseBody body;

    public static ModifyDBInstanceDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDeletionProtectionResponse self = new ModifyDBInstanceDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDeletionProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceDeletionProtectionResponse setBody(ModifyDBInstanceDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
