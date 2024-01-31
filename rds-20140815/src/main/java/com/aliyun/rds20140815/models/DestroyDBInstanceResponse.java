// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DestroyDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DestroyDBInstanceResponseBody body;

    public static DestroyDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyDBInstanceResponse self = new DestroyDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DestroyDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyDBInstanceResponse setBody(DestroyDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyDBInstanceResponseBody getBody() {
        return this.body;
    }

}
