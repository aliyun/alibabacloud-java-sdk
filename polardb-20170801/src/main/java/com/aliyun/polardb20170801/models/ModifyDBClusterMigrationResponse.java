// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterMigrationResponseBody body;

    public static ModifyDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationResponse self = new ModifyDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterMigrationResponse setBody(ModifyDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
