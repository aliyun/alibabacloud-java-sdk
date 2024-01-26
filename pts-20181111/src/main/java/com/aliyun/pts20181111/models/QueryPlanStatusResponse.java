// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class QueryPlanStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPlanStatusResponseBody body;

    public static QueryPlanStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPlanStatusResponse self = new QueryPlanStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryPlanStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPlanStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPlanStatusResponse setBody(QueryPlanStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPlanStatusResponseBody getBody() {
        return this.body;
    }

}
