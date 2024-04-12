// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabaseAccountsResponseBody body;

    public static ListDatabaseAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsResponse self = new ListDatabaseAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseAccountsResponse setBody(ListDatabaseAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseAccountsResponseBody getBody() {
        return this.body;
    }

}
