// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ContinueDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContinueDBClusterMigrationResponseBody body;

    public static ContinueDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueDBClusterMigrationResponse self = new ContinueDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public ContinueDBClusterMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueDBClusterMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinueDBClusterMigrationResponse setBody(ContinueDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
