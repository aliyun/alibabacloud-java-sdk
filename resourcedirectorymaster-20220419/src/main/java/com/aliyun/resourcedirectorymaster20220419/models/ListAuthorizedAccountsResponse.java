// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAuthorizedAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedAccountsResponseBody body;

    public static ListAuthorizedAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAccountsResponse self = new ListAuthorizedAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedAccountsResponse setBody(ListAuthorizedAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedAccountsResponseBody getBody() {
        return this.body;
    }

}
