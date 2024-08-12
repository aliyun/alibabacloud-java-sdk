// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class BindAccountLessLoginUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAccountLessLoginUserResponseBody body;

    public static BindAccountLessLoginUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAccountLessLoginUserResponse self = new BindAccountLessLoginUserResponse();
        return TeaModel.build(map, self);
    }

    public BindAccountLessLoginUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAccountLessLoginUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAccountLessLoginUserResponse setBody(BindAccountLessLoginUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAccountLessLoginUserResponseBody getBody() {
        return this.body;
    }

}
