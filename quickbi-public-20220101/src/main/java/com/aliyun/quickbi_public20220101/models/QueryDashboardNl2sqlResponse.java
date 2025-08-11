// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDashboardNl2sqlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDashboardNl2sqlResponseBody body;

    public static QueryDashboardNl2sqlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDashboardNl2sqlResponse self = new QueryDashboardNl2sqlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDashboardNl2sqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDashboardNl2sqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDashboardNl2sqlResponse setBody(QueryDashboardNl2sqlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDashboardNl2sqlResponseBody getBody() {
        return this.body;
    }

}
