// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDelayedReplicationTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceDelayedReplicationTimeResponseBody body;

    public static ModifyDBInstanceDelayedReplicationTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDelayedReplicationTimeResponse self = new ModifyDBInstanceDelayedReplicationTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDelayedReplicationTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceDelayedReplicationTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceDelayedReplicationTimeResponse setBody(ModifyDBInstanceDelayedReplicationTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceDelayedReplicationTimeResponseBody getBody() {
        return this.body;
    }

}
