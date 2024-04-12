// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListHostGroupAccountNamesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostGroupAccountNamesForUserResponse setBody(ListHostGroupAccountNamesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupAccountNamesForUserResponseBody getBody() {
        return this.body;
    }

}
