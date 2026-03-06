// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseAuthConfigsForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySupabaseAuthConfigsForAdminResponseBody body;

    public static QuerySupabaseAuthConfigsForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupabaseAuthConfigsForAdminResponse self = new QuerySupabaseAuthConfigsForAdminResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupabaseAuthConfigsForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupabaseAuthConfigsForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupabaseAuthConfigsForAdminResponse setBody(QuerySupabaseAuthConfigsForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupabaseAuthConfigsForAdminResponseBody getBody() {
        return this.body;
    }

}
