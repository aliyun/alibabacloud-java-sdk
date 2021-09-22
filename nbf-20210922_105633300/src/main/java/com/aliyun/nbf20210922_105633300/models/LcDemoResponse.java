// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210922_105633300.models;

import com.aliyun.tea.*;

public class LcDemoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LcDemoResponseBody body;

    public static LcDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        LcDemoResponse self = new LcDemoResponse();
        return TeaModel.build(map, self);
    }

    public LcDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LcDemoResponse setBody(LcDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public LcDemoResponseBody getBody() {
        return this.body;
    }

}
