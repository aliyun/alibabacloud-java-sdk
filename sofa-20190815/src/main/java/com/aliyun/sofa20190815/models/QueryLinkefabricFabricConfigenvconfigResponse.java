// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricConfigenvconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricConfigenvconfigResponseBody body;

    public static QueryLinkefabricFabricConfigenvconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricConfigenvconfigResponse self = new QueryLinkefabricFabricConfigenvconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricConfigenvconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricConfigenvconfigResponse setBody(QueryLinkefabricFabricConfigenvconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricConfigenvconfigResponseBody getBody() {
        return this.body;
    }

}
