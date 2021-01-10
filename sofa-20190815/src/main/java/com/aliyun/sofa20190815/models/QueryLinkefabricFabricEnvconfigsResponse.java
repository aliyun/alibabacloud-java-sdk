// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricEnvconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricEnvconfigsResponseBody body;

    public static QueryLinkefabricFabricEnvconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricEnvconfigsResponse self = new QueryLinkefabricFabricEnvconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricEnvconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricEnvconfigsResponse setBody(QueryLinkefabricFabricEnvconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricEnvconfigsResponseBody getBody() {
        return this.body;
    }

}
