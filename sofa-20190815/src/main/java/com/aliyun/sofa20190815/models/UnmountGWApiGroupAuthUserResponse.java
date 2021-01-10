// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UnmountGWApiGroupAuthUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnmountGWApiGroupAuthUserResponseBody body;

    public static UnmountGWApiGroupAuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmountGWApiGroupAuthUserResponse self = new UnmountGWApiGroupAuthUserResponse();
        return TeaModel.build(map, self);
    }

    public UnmountGWApiGroupAuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmountGWApiGroupAuthUserResponse setBody(UnmountGWApiGroupAuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmountGWApiGroupAuthUserResponseBody getBody() {
        return this.body;
    }

}
