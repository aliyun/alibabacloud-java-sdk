// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectProbtaskResponseBody body;

    public static QueryHasInspectProbtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbtaskResponse self = new QueryHasInspectProbtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectProbtaskResponse setBody(QueryHasInspectProbtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectProbtaskResponseBody getBody() {
        return this.body;
    }

}
