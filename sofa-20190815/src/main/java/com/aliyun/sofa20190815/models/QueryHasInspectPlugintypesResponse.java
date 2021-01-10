// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPlugintypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectPlugintypesResponseBody body;

    public static QueryHasInspectPlugintypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPlugintypesResponse self = new QueryHasInspectPlugintypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPlugintypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectPlugintypesResponse setBody(QueryHasInspectPlugintypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectPlugintypesResponseBody getBody() {
        return this.body;
    }

}
