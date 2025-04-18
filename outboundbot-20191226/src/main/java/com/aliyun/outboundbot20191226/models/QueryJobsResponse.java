// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryJobsResponseBody body;

    public static QueryJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsResponse self = new QueryJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryJobsResponse setBody(QueryJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobsResponseBody getBody() {
        return this.body;
    }

}
