// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSchedulerconfigsResponseBody body;

    public static QueryLinkefabricFabricSchedulerconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsResponse self = new QueryLinkefabricFabricSchedulerconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponse setBody(QueryLinkefabricFabricSchedulerconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSchedulerconfigsResponseBody getBody() {
        return this.body;
    }

}
