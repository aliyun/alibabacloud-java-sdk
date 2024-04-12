// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabaseAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationDatabaseAccountsResponseBody body;

    public static ListOperationDatabaseAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabaseAccountsResponse self = new ListOperationDatabaseAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabaseAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationDatabaseAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationDatabaseAccountsResponse setBody(ListOperationDatabaseAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationDatabaseAccountsResponseBody getBody() {
        return this.body;
    }

}
