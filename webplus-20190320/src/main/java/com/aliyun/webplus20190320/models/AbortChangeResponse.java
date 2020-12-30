// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class AbortChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbortChangeResponseBody body;

    public static AbortChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeResponse self = new AbortChangeResponse();
        return TeaModel.build(map, self);
    }

    public AbortChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortChangeResponse setBody(AbortChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortChangeResponseBody getBody() {
        return this.body;
    }

}
