// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricZdalconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricZdalconfigsResponseBody body;

    public static QueryLinkefabricFabricZdalconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricZdalconfigsResponse self = new QueryLinkefabricFabricZdalconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricZdalconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricZdalconfigsResponse setBody(QueryLinkefabricFabricZdalconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricZdalconfigsResponseBody getBody() {
        return this.body;
    }

}
