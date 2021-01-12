// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CloneDBInstanceResponse setBody(CloneDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneDBInstanceResponseBody getBody() {
        return this.body;
    }

}
