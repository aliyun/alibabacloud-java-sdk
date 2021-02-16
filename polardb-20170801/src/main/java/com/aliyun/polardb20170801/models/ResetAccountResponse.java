// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAccountResponseBody body;

    public static ResetAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountResponse self = new ResetAccountResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountResponse setBody(ResetAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountResponseBody getBody() {
        return this.body;
    }

}
