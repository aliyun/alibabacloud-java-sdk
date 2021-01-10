// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRProductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPLRProductsResponseBody body;

    public static QueryPLRProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRProductsResponse self = new QueryPLRProductsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPLRProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPLRProductsResponse setBody(QueryPLRProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPLRProductsResponseBody getBody() {
        return this.body;
    }

}
