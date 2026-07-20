// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRbacUserRolesResponseBody body;

    public static QueryRbacUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacUserRolesResponse self = new QueryRbacUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRbacUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRbacUserRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRbacUserRolesResponse setBody(QueryRbacUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRbacUserRolesResponseBody getBody() {
        return this.body;
    }

}
