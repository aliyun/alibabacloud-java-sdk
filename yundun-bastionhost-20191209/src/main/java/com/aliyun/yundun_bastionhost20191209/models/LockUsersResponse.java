// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class LockUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LockUsersResponseBody body;

    public static LockUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        LockUsersResponse self = new LockUsersResponse();
        return TeaModel.build(map, self);
    }

    public LockUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockUsersResponse setBody(LockUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public LockUsersResponseBody getBody() {
        return this.body;
    }

}
