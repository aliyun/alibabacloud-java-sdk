// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDBInstanceReplicationResponseBody body;

    public static UpdateDBInstanceReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceReplicationResponse self = new UpdateDBInstanceReplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDBInstanceReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDBInstanceReplicationResponse setBody(UpdateDBInstanceReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDBInstanceReplicationResponseBody getBody() {
        return this.body;
    }

}
