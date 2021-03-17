// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostGroupAccountNamesForUserResponseBody body;

    public static ListHostGroupAccountNamesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserResponse self = new ListHostGroupAccountNamesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupAccountNamesForUserResponse setBody(ListHostGroupAccountNamesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupAccountNamesForUserResponseBody getBody() {
        return this.body;
    }

}
