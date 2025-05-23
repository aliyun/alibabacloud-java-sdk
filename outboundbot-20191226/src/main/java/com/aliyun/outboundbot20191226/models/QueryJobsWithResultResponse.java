// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryJobsWithResultResponseBody body;

    public static QueryJobsWithResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsWithResultResponse self = new QueryJobsWithResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobsWithResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobsWithResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryJobsWithResultResponse setBody(QueryJobsWithResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobsWithResultResponseBody getBody() {
        return this.body;
    }

}
