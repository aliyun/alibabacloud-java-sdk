// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCacheResponseBody body;

    public static CreateCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheResponse self = new CreateCacheResponse();
        return TeaModel.build(map, self);
    }

    public CreateCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCacheResponse setBody(CreateCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCacheResponseBody getBody() {
        return this.body;
    }

}
