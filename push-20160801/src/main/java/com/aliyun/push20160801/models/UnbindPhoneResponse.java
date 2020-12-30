// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindPhoneResponseBody body;

    public static UnbindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPhoneResponse self = new UnbindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPhoneResponse setBody(UnbindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPhoneResponseBody getBody() {
        return this.body;
    }

}
