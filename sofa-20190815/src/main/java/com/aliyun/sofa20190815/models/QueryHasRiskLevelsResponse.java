// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskLevelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskLevelsResponseBody body;

    public static QueryHasRiskLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskLevelsResponse self = new QueryHasRiskLevelsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskLevelsResponse setBody(QueryHasRiskLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskLevelsResponseBody getBody() {
        return this.body;
    }

}
