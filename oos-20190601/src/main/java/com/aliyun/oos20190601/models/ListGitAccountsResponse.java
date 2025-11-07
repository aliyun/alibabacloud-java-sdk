// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGitAccountsResponseBody body;

    public static ListGitAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGitAccountsResponse self = new ListGitAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListGitAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGitAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGitAccountsResponse setBody(ListGitAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGitAccountsResponseBody getBody() {
        return this.body;
    }

}
