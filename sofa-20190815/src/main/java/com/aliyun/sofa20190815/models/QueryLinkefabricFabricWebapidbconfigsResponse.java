// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricWebapidbconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricWebapidbconfigsResponseBody body;

    public static QueryLinkefabricFabricWebapidbconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricWebapidbconfigsResponse self = new QueryLinkefabricFabricWebapidbconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricWebapidbconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricWebapidbconfigsResponse setBody(QueryLinkefabricFabricWebapidbconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricWebapidbconfigsResponseBody getBody() {
        return this.body;
    }

}
