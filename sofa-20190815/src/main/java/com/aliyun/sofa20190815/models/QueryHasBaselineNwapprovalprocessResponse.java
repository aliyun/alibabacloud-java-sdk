// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineNwapprovalprocessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineNwapprovalprocessResponseBody body;

    public static QueryHasBaselineNwapprovalprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineNwapprovalprocessResponse self = new QueryHasBaselineNwapprovalprocessResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineNwapprovalprocessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineNwapprovalprocessResponse setBody(QueryHasBaselineNwapprovalprocessResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineNwapprovalprocessResponseBody getBody() {
        return this.body;
    }

}
