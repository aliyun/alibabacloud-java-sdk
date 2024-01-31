// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class LockAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LockAccountResponseBody body;

    public static LockAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        LockAccountResponse self = new LockAccountResponse();
        return TeaModel.build(map, self);
    }

    public LockAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockAccountResponse setBody(LockAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public LockAccountResponseBody getBody() {
        return this.body;
    }

}
