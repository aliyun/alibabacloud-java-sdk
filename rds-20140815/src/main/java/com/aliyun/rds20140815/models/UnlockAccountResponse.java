// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnlockAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UnlockAccountResponse setBody(UnlockAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockAccountResponseBody getBody() {
        return this.body;
    }

}
