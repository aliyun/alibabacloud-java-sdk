// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlszopsurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlszopsurlResponseBody body;

    public static QueryLinkefabricFabricUrlszopsurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlszopsurlResponse self = new QueryLinkefabricFabricUrlszopsurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlszopsurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlszopsurlResponse setBody(QueryLinkefabricFabricUrlszopsurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlszopsurlResponseBody getBody() {
        return this.body;
    }

}
