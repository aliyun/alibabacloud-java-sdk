// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public MigrateDBInstanceResponse setBody(MigrateDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDBInstanceResponseBody getBody() {
        return this.body;
    }

}
