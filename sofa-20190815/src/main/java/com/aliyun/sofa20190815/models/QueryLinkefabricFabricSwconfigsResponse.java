// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSwconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSwconfigsResponseBody body;

    public static QueryLinkefabricFabricSwconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSwconfigsResponse self = new QueryLinkefabricFabricSwconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSwconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSwconfigsResponse setBody(QueryLinkefabricFabricSwconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSwconfigsResponseBody getBody() {
        return this.body;
    }

}
