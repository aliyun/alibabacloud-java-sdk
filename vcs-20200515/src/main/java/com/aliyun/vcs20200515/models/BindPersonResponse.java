// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindPersonResponseBody body;

    public static BindPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPersonResponse self = new BindPersonResponse();
        return TeaModel.build(map, self);
    }

    public BindPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPersonResponse setBody(BindPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPersonResponseBody getBody() {
        return this.body;
    }

}
