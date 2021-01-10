// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectJavataskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectJavataskResponseBody body;

    public static QueryHasInspectJavataskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectJavataskResponse self = new QueryHasInspectJavataskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectJavataskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectJavataskResponse setBody(QueryHasInspectJavataskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectJavataskResponseBody getBody() {
        return this.body;
    }

}
