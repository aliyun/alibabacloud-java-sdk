// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutboundJobsResponseBody body;

    public static QueryOutboundJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobsResponse self = new QueryOutboundJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutboundJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOutboundJobsResponse setBody(QueryOutboundJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutboundJobsResponseBody getBody() {
        return this.body;
    }

}
