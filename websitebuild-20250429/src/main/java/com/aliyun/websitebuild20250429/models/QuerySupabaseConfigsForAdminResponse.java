// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseConfigsForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySupabaseConfigsForAdminResponseBody body;

    public static QuerySupabaseConfigsForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupabaseConfigsForAdminResponse self = new QuerySupabaseConfigsForAdminResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupabaseConfigsForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupabaseConfigsForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupabaseConfigsForAdminResponse setBody(QuerySupabaseConfigsForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupabaseConfigsForAdminResponseBody getBody() {
        return this.body;
    }

}
