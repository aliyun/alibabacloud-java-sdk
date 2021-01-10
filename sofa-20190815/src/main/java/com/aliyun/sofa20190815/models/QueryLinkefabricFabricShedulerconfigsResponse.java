// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricShedulerconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricShedulerconfigsResponseBody body;

    public static QueryLinkefabricFabricShedulerconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricShedulerconfigsResponse self = new QueryLinkefabricFabricShedulerconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricShedulerconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricShedulerconfigsResponse setBody(QueryLinkefabricFabricShedulerconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricShedulerconfigsResponseBody getBody() {
        return this.body;
    }

}
