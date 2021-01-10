// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbtaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectProbtaskdetailResponseBody body;

    public static QueryHasInspectProbtaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbtaskdetailResponse self = new QueryHasInspectProbtaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbtaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectProbtaskdetailResponse setBody(QueryHasInspectProbtaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectProbtaskdetailResponseBody getBody() {
        return this.body;
    }

}
