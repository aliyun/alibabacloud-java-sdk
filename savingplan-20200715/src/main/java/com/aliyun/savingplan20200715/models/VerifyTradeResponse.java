// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class VerifyTradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyTradeResponseBody body;

    public static VerifyTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyTradeResponse self = new VerifyTradeResponse();
        return TeaModel.build(map, self);
    }

    public VerifyTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyTradeResponse setBody(VerifyTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyTradeResponseBody getBody() {
        return this.body;
    }

}
