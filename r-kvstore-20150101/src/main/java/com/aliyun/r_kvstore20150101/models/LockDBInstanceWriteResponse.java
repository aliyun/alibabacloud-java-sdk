// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class LockDBInstanceWriteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LockDBInstanceWriteResponseBody body;

    public static LockDBInstanceWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        LockDBInstanceWriteResponse self = new LockDBInstanceWriteResponse();
        return TeaModel.build(map, self);
    }

    public LockDBInstanceWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockDBInstanceWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockDBInstanceWriteResponse setBody(LockDBInstanceWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public LockDBInstanceWriteResponseBody getBody() {
        return this.body;
    }

}
