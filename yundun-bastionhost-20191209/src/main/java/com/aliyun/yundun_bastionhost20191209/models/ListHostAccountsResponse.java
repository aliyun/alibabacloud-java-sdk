// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostAccountsResponseBody body;

    public static ListHostAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsResponse self = new ListHostAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostAccountsResponse setBody(ListHostAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostAccountsResponseBody getBody() {
        return this.body;
    }

}
