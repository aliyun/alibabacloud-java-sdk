// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecoveryDBInstanceResponse setBody(RecoveryDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryDBInstanceResponseBody getBody() {
        return this.body;
    }

}
