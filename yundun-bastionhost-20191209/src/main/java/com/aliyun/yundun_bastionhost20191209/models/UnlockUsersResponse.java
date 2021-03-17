// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UnlockUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockUsersResponseBody body;

    public static UnlockUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersResponse self = new UnlockUsersResponse();
        return TeaModel.build(map, self);
    }

    public UnlockUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockUsersResponse setBody(UnlockUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockUsersResponseBody getBody() {
        return this.body;
    }

}
