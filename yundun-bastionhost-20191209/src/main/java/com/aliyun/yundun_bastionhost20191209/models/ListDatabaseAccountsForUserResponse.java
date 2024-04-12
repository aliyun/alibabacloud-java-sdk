// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabaseAccountsForUserResponseBody body;

    public static ListDatabaseAccountsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsForUserResponse self = new ListDatabaseAccountsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseAccountsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseAccountsForUserResponse setBody(ListDatabaseAccountsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseAccountsForUserResponseBody getBody() {
        return this.body;
    }

}
