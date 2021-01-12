// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DestroyDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DestroyDBInstanceResponse setBody(DestroyDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyDBInstanceResponseBody getBody() {
        return this.body;
    }

}
