// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskItemResponseBody body;

    public static QueryHasRiskItemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskItemResponse self = new QueryHasRiskItemResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskItemResponse setBody(QueryHasRiskItemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskItemResponseBody getBody() {
        return this.body;
    }

}
