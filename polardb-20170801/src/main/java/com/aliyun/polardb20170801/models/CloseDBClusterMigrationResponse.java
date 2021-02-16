// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseDBClusterMigrationResponseBody body;

    public static CloseDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDBClusterMigrationResponse self = new CloseDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public CloseDBClusterMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDBClusterMigrationResponse setBody(CloseDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
