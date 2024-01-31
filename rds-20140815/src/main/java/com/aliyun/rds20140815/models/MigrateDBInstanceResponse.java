// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateDBInstanceResponseBody body;

    public static MigrateDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceResponse self = new MigrateDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public MigrateDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateDBInstanceResponse setBody(MigrateDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDBInstanceResponseBody getBody() {
        return this.body;
    }

}
