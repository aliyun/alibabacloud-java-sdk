// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AbortDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortDBClusterMigrationResponseBody body;

    public static AbortDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortDBClusterMigrationResponse self = new AbortDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public AbortDBClusterMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortDBClusterMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortDBClusterMigrationResponse setBody(AbortDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
