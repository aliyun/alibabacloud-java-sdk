// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCiconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCiconfigsResponseBody body;

    public static QueryLinkefabricFabricCiconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCiconfigsResponse self = new QueryLinkefabricFabricCiconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCiconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCiconfigsResponse setBody(QueryLinkefabricFabricCiconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCiconfigsResponseBody getBody() {
        return this.body;
    }

}
