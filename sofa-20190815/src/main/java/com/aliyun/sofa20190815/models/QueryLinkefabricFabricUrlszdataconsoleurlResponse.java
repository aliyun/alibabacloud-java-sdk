// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlszdataconsoleurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlszdataconsoleurlResponseBody body;

    public static QueryLinkefabricFabricUrlszdataconsoleurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlszdataconsoleurlResponse self = new QueryLinkefabricFabricUrlszdataconsoleurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlszdataconsoleurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlszdataconsoleurlResponse setBody(QueryLinkefabricFabricUrlszdataconsoleurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlszdataconsoleurlResponseBody getBody() {
        return this.body;
    }

}
