// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class LockTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LockTSActivityInstanceResponseBody body;

    public static LockTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockTSActivityInstanceResponse self = new LockTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public LockTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockTSActivityInstanceResponse setBody(LockTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public LockTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
