// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterMigrationEndpointResponseBody body;

    public static ModifyDBClusterMigrationEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationEndpointResponse self = new ModifyDBClusterMigrationEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMigrationEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterMigrationEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterMigrationEndpointResponse setBody(ModifyDBClusterMigrationEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterMigrationEndpointResponseBody getBody() {
        return this.body;
    }

}
