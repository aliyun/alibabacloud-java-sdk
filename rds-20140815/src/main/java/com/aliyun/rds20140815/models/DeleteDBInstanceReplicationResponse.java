// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstanceReplicationResponseBody body;

    public static DeleteDBInstanceReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceReplicationResponse self = new DeleteDBInstanceReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstanceReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstanceReplicationResponse setBody(DeleteDBInstanceReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstanceReplicationResponseBody getBody() {
        return this.body;
    }

}
