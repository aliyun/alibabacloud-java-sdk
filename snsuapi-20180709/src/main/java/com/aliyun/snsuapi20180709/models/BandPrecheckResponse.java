// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandPrecheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandPrecheckResponseBody body;

    public static BandPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        BandPrecheckResponse self = new BandPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public BandPrecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandPrecheckResponse setBody(BandPrecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public BandPrecheckResponseBody getBody() {
        return this.body;
    }

}
