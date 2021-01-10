// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineAppinstanceResponseBody body;

    public static QueryHasBaselineAppinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstanceResponse self = new QueryHasBaselineAppinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineAppinstanceResponse setBody(QueryHasBaselineAppinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineAppinstanceResponseBody getBody() {
        return this.body;
    }

}
