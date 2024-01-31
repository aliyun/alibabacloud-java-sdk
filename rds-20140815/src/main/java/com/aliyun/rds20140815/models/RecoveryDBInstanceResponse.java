// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoveryDBInstanceResponseBody body;

    public static RecoveryDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDBInstanceResponse self = new RecoveryDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RecoveryDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoveryDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoveryDBInstanceResponse setBody(RecoveryDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryDBInstanceResponseBody getBody() {
        return this.body;
    }

}
