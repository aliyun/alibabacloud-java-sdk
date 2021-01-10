// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricExistdrmresourcetplResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricExistdrmresourcetplResponseBody body;

    public static QueryLinkefabricFabricExistdrmresourcetplResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricExistdrmresourcetplResponse self = new QueryLinkefabricFabricExistdrmresourcetplResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricExistdrmresourcetplResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricExistdrmresourcetplResponse setBody(QueryLinkefabricFabricExistdrmresourcetplResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricExistdrmresourcetplResponseBody getBody() {
        return this.body;
    }

}
