// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindPersonResponseBody body;

    public static UnbindPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPersonResponse self = new UnbindPersonResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPersonResponse setBody(UnbindPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPersonResponseBody getBody() {
        return this.body;
    }

}
