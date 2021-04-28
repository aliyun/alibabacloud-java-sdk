// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class FoobarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FoobarResponseBody body;

    public static FoobarResponse build(java.util.Map<String, ?> map) throws Exception {
        FoobarResponse self = new FoobarResponse();
        return TeaModel.build(map, self);
    }

    public FoobarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FoobarResponse setBody(FoobarResponseBody body) {
        this.body = body;
        return this;
    }
    public FoobarResponseBody getBody() {
        return this.body;
    }

}
