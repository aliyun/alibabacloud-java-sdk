// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRbacPermissionsResponseBody body;

    public static ListRbacPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRbacPermissionsResponse self = new ListRbacPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRbacPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRbacPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRbacPermissionsResponse setBody(ListRbacPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRbacPermissionsResponseBody getBody() {
        return this.body;
    }

}
