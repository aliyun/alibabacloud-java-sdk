// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindAliasResponseBody body;

    public static BindAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAliasResponse self = new BindAliasResponse();
        return TeaModel.build(map, self);
    }

    public BindAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAliasResponse setBody(BindAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAliasResponseBody getBody() {
        return this.body;
    }

}
