// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsfabricurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsfabricurlResponseBody body;

    public static QueryLinkefabricFabricUrlsfabricurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsfabricurlResponse self = new QueryLinkefabricFabricUrlsfabricurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsfabricurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsfabricurlResponse setBody(QueryLinkefabricFabricUrlsfabricurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsfabricurlResponseBody getBody() {
        return this.body;
    }

}
