// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class PeekNvrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PeekNvrResponseBody body;

    public static PeekNvrResponse build(java.util.Map<String, ?> map) throws Exception {
        PeekNvrResponse self = new PeekNvrResponse();
        return TeaModel.build(map, self);
    }

    public PeekNvrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PeekNvrResponse setBody(PeekNvrResponseBody body) {
        this.body = body;
        return this;
    }
    public PeekNvrResponseBody getBody() {
        return this.body;
    }

}
