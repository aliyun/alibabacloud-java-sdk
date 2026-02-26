// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseInstanceInfoForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySupabaseInstanceInfoForAdminResponseBody body;

    public static QuerySupabaseInstanceInfoForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupabaseInstanceInfoForAdminResponse self = new QuerySupabaseInstanceInfoForAdminResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupabaseInstanceInfoForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupabaseInstanceInfoForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupabaseInstanceInfoForAdminResponse setBody(QuerySupabaseInstanceInfoForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupabaseInstanceInfoForAdminResponseBody getBody() {
        return this.body;
    }

}
