// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushResponseBody body;

    public static PushResponse build(java.util.Map<String, ?> map) throws Exception {
        PushResponse self = new PushResponse();
        return TeaModel.build(map, self);
    }

    public PushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushResponse setBody(PushResponseBody body) {
        this.body = body;
        return this;
    }
    public PushResponseBody getBody() {
        return this.body;
    }

}
