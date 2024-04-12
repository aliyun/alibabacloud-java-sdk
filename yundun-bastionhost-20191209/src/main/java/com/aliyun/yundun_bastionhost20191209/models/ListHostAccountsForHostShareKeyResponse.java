// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHostAccountsForHostShareKeyResponseBody body;

    public static ListHostAccountsForHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForHostShareKeyResponse self = new ListHostAccountsForHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostAccountsForHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostAccountsForHostShareKeyResponse setBody(ListHostAccountsForHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostAccountsForHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
