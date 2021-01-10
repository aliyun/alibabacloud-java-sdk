// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsopsslaurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsopsslaurlResponseBody body;

    public static QueryLinkefabricFabricUrlsopsslaurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsopsslaurlResponse self = new QueryLinkefabricFabricUrlsopsslaurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsopsslaurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsopsslaurlResponse setBody(QueryLinkefabricFabricUrlsopsslaurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsopsslaurlResponseBody getBody() {
        return this.body;
    }

}
