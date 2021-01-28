// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGlobalDistributeCacheResponseBody body;

    public static CreateGlobalDistributeCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheResponse self = new CreateGlobalDistributeCacheResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalDistributeCacheResponse setBody(CreateGlobalDistributeCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalDistributeCacheResponseBody getBody() {
        return this.body;
    }

}
