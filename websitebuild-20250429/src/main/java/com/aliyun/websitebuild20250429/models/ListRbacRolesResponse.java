// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRbacRolesResponseBody body;

    public static ListRbacRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRbacRolesResponse self = new ListRbacRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListRbacRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRbacRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRbacRolesResponse setBody(ListRbacRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRbacRolesResponseBody getBody() {
        return this.body;
    }

}
