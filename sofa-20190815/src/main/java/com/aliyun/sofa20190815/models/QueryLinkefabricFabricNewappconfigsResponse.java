// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricNewappconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricNewappconfigsResponseBody body;

    public static QueryLinkefabricFabricNewappconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricNewappconfigsResponse self = new QueryLinkefabricFabricNewappconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricNewappconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricNewappconfigsResponse setBody(QueryLinkefabricFabricNewappconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricNewappconfigsResponseBody getBody() {
        return this.body;
    }

}
