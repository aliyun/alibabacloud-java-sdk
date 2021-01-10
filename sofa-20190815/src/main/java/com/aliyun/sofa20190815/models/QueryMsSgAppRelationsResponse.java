// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgAppRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgAppRelationsResponseBody body;

    public static QueryMsSgAppRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgAppRelationsResponse self = new QueryMsSgAppRelationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgAppRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgAppRelationsResponse setBody(QueryMsSgAppRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgAppRelationsResponseBody getBody() {
        return this.body;
    }

}
