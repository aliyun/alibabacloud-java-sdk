// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceSubRelationsResponseBody body;

    public static QueryMsSgServiceSubRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubRelationsResponse self = new QueryMsSgServiceSubRelationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceSubRelationsResponse setBody(QueryMsSgServiceSubRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceSubRelationsResponseBody getBody() {
        return this.body;
    }

}
