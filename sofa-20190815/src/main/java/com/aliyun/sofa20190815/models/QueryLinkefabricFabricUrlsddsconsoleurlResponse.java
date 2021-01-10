// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsddsconsoleurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsddsconsoleurlResponseBody body;

    public static QueryLinkefabricFabricUrlsddsconsoleurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsddsconsoleurlResponse self = new QueryLinkefabricFabricUrlsddsconsoleurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsddsconsoleurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsddsconsoleurlResponse setBody(QueryLinkefabricFabricUrlsddsconsoleurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsddsconsoleurlResponseBody getBody() {
        return this.body;
    }

}
