// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectWebruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectWebruleResponseBody body;

    public static QueryHasInspectWebruleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectWebruleResponse self = new QueryHasInspectWebruleResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectWebruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectWebruleResponse setBody(QueryHasInspectWebruleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectWebruleResponseBody getBody() {
        return this.body;
    }

}
