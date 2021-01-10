// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountGWApiGroupAuthUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MountGWApiGroupAuthUserResponseBody body;

    public static MountGWApiGroupAuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        MountGWApiGroupAuthUserResponse self = new MountGWApiGroupAuthUserResponse();
        return TeaModel.build(map, self);
    }

    public MountGWApiGroupAuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountGWApiGroupAuthUserResponse setBody(MountGWApiGroupAuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public MountGWApiGroupAuthUserResponseBody getBody() {
        return this.body;
    }

}
