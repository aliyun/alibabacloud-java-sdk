// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDatabaseAccountsFromUserResponseBody body;

    public static DetachDatabaseAccountsFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserResponse self = new DetachDatabaseAccountsFromUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDatabaseAccountsFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDatabaseAccountsFromUserResponse setBody(DetachDatabaseAccountsFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDatabaseAccountsFromUserResponseBody getBody() {
        return this.body;
    }

}
