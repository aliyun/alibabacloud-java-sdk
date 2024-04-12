// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationHostAccountsResponseBody body;

    public static ListOperationHostAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostAccountsResponse self = new ListOperationHostAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationHostAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationHostAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationHostAccountsResponse setBody(ListOperationHostAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationHostAccountsResponseBody getBody() {
        return this.body;
    }

}
