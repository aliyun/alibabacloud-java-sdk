// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstanceReplicationResponseBody body;

    public static CreateDBInstanceReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceReplicationResponse self = new CreateDBInstanceReplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstanceReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstanceReplicationResponse setBody(CreateDBInstanceReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstanceReplicationResponseBody getBody() {
        return this.body;
    }

}
