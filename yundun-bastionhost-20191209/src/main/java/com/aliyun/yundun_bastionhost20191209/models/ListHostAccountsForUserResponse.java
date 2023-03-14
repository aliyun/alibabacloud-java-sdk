// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostAccountsForUserResponseBody body;

    public static ListHostAccountsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserResponse self = new ListHostAccountsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostAccountsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostAccountsForUserResponse setBody(ListHostAccountsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostAccountsForUserResponseBody getBody() {
        return this.body;
    }

}
