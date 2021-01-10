// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdsJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdsJobsResponseBody body;

    public static QueryMSDdsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdsJobsResponse self = new QueryMSDdsJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdsJobsResponse setBody(QueryMSDdsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdsJobsResponseBody getBody() {
        return this.body;
    }

}
