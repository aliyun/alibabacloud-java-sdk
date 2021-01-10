// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsaoneurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsaoneurlResponseBody body;

    public static QueryLinkefabricFabricUrlsaoneurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsaoneurlResponse self = new QueryLinkefabricFabricUrlsaoneurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsaoneurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsaoneurlResponse setBody(QueryLinkefabricFabricUrlsaoneurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsaoneurlResponseBody getBody() {
        return this.body;
    }

}
