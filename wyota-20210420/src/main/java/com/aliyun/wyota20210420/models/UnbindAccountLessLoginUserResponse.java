// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindAccountLessLoginUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAccountLessLoginUserResponseBody body;

    public static UnbindAccountLessLoginUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountLessLoginUserResponse self = new UnbindAccountLessLoginUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAccountLessLoginUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAccountLessLoginUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAccountLessLoginUserResponse setBody(UnbindAccountLessLoginUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAccountLessLoginUserResponseBody getBody() {
        return this.body;
    }

}
