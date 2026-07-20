// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRolePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRbacRolePermissionsResponseBody body;

    public static QueryRbacRolePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRolePermissionsResponse self = new QueryRbacRolePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbacRolePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRbacRolePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRbacRolePermissionsResponse setBody(QueryRbacRolePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRbacRolePermissionsResponseBody getBody() {
        return this.body;
    }

}
