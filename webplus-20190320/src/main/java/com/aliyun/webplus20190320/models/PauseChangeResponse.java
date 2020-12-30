// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class PauseChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PauseChangeResponseBody body;

    public static PauseChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseChangeResponse self = new PauseChangeResponse();
        return TeaModel.build(map, self);
    }

    public PauseChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseChangeResponse setBody(PauseChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseChangeResponseBody getBody() {
        return this.body;
    }

}
