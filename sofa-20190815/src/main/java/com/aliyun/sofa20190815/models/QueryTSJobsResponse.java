// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobsResponseBody body;

    public static QueryTSJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobsResponse self = new QueryTSJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobsResponse setBody(QueryTSJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobsResponseBody getBody() {
        return this.body;
    }

}
