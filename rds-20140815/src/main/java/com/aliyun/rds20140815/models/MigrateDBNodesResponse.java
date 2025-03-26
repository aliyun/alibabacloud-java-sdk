// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MigrateDBNodesResponseBody body;

    public static MigrateDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBNodesResponse self = new MigrateDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public MigrateDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MigrateDBNodesResponse setBody(MigrateDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDBNodesResponseBody getBody() {
        return this.body;
    }

}
