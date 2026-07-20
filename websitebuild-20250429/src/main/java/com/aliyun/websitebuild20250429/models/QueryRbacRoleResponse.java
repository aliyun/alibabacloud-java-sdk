// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRbacRoleResponseBody body;

    public static QueryRbacRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRoleResponse self = new QueryRbacRoleResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbacRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRbacRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRbacRoleResponse setBody(QueryRbacRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRbacRoleResponseBody getBody() {
        return this.body;
    }

}
