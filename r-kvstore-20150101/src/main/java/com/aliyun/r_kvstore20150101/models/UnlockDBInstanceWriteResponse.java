// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class UnlockDBInstanceWriteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockDBInstanceWriteResponseBody body;

    public static UnlockDBInstanceWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockDBInstanceWriteResponse self = new UnlockDBInstanceWriteResponse();
        return TeaModel.build(map, self);
    }

    public UnlockDBInstanceWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockDBInstanceWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockDBInstanceWriteResponse setBody(UnlockDBInstanceWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockDBInstanceWriteResponseBody getBody() {
        return this.body;
    }

}
