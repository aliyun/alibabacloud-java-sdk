// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneDBInstanceResponseBody body;

    public static CloneDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceResponse self = new CloneDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CloneDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneDBInstanceResponse setBody(CloneDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneDBInstanceResponseBody getBody() {
        return this.body;
    }

}
