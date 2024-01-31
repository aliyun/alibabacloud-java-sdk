// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnlockAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnlockAccountResponseBody body;

    public static UnlockAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockAccountResponse self = new UnlockAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnlockAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockAccountResponse setBody(UnlockAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockAccountResponseBody getBody() {
        return this.body;
    }

}
