// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskSourcesResponseBody body;

    public static QueryHasRiskSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskSourcesResponse self = new QueryHasRiskSourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskSourcesResponse setBody(QueryHasRiskSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskSourcesResponseBody getBody() {
        return this.body;
    }

}
