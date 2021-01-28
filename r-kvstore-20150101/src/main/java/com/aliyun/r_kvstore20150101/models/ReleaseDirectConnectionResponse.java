// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReleaseDirectConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseDirectConnectionResponseBody body;

    public static ReleaseDirectConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDirectConnectionResponse self = new ReleaseDirectConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseDirectConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseDirectConnectionResponse setBody(ReleaseDirectConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseDirectConnectionResponseBody getBody() {
        return this.body;
    }

}
