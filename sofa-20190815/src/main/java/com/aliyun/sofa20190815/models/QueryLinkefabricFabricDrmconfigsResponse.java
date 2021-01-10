// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDrmconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricDrmconfigsResponseBody body;

    public static QueryLinkefabricFabricDrmconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDrmconfigsResponse self = new QueryLinkefabricFabricDrmconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDrmconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricDrmconfigsResponse setBody(QueryLinkefabricFabricDrmconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricDrmconfigsResponseBody getBody() {
        return this.body;
    }

}
