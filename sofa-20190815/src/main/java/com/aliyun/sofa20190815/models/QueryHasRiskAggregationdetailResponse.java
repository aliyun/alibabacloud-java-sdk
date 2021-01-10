// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskAggregationdetailResponseBody body;

    public static QueryHasRiskAggregationdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationdetailResponse self = new QueryHasRiskAggregationdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskAggregationdetailResponse setBody(QueryHasRiskAggregationdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskAggregationdetailResponseBody getBody() {
        return this.body;
    }

}
