// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UnlockUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnlockUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockUsersResponse setBody(UnlockUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockUsersResponseBody getBody() {
        return this.body;
    }

}
