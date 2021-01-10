// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSoftwareconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSoftwareconfigsResponseBody body;

    public static QueryLinkefabricFabricSoftwareconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSoftwareconfigsResponse self = new QueryLinkefabricFabricSoftwareconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSoftwareconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponse setBody(QueryLinkefabricFabricSoftwareconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSoftwareconfigsResponseBody getBody() {
        return this.body;
    }

}
