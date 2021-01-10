// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDockerruleconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricDockerruleconfigsResponseBody body;

    public static QueryLinkefabricFabricDockerruleconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDockerruleconfigsResponse self = new QueryLinkefabricFabricDockerruleconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDockerruleconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponse setBody(QueryLinkefabricFabricDockerruleconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricDockerruleconfigsResponseBody getBody() {
        return this.body;
    }

}
