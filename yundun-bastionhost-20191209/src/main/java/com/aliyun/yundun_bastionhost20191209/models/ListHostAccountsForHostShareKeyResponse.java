// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListHostAccountsForHostShareKeyResponse setBody(ListHostAccountsForHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostAccountsForHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
