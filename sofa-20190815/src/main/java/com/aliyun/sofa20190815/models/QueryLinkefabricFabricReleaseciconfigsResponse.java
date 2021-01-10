// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseciconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleaseciconfigsResponseBody body;

    public static QueryLinkefabricFabricReleaseciconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseciconfigsResponse self = new QueryLinkefabricFabricReleaseciconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseciconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponse setBody(QueryLinkefabricFabricReleaseciconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleaseciconfigsResponseBody getBody() {
        return this.body;
    }

}
