// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAuthRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthRolesResponseBody body;

    public static ListAuthRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRolesResponse self = new ListAuthRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthRolesResponse setBody(ListAuthRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthRolesResponseBody getBody() {
        return this.body;
    }

}
