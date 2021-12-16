// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterprecall1_0_0.models;

import com.aliyun.tea.*;

public class BhOrderChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BhOrderChangeResponseBody body;

    public static BhOrderChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        BhOrderChangeResponse self = new BhOrderChangeResponse();
        return TeaModel.build(map, self);
    }

    public BhOrderChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BhOrderChangeResponse setBody(BhOrderChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public BhOrderChangeResponseBody getBody() {
        return this.body;
    }

}
