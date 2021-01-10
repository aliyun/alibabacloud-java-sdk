// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricPublicappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricPublicappsResponseBody body;

    public static QueryLinkefabricFabricPublicappsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricPublicappsResponse self = new QueryLinkefabricFabricPublicappsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricPublicappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricPublicappsResponse setBody(QueryLinkefabricFabricPublicappsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricPublicappsResponseBody getBody() {
        return this.body;
    }

}
