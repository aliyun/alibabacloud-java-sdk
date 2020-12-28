// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuperResolveVideoResponseBody body;

    public static SuperResolveVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoResponse self = new SuperResolveVideoResponse();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuperResolveVideoResponse setBody(SuperResolveVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public SuperResolveVideoResponseBody getBody() {
        return this.body;
    }

}
