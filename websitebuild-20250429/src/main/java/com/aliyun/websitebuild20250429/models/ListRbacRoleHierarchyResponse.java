// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacRoleHierarchyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRbacRoleHierarchyResponseBody body;

    public static ListRbacRoleHierarchyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRbacRoleHierarchyResponse self = new ListRbacRoleHierarchyResponse();
        return TeaModel.build(map, self);
    }

    public ListRbacRoleHierarchyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRbacRoleHierarchyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRbacRoleHierarchyResponse setBody(ListRbacRoleHierarchyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRbacRoleHierarchyResponseBody getBody() {
        return this.body;
    }

}
