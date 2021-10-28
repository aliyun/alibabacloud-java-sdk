// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployCacheDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployCacheDiskResponseBody body;

    public static DeployCacheDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployCacheDiskResponse self = new DeployCacheDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeployCacheDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployCacheDiskResponse setBody(DeployCacheDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployCacheDiskResponseBody getBody() {
        return this.body;
    }

}
