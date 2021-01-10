// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasedrmconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleasedrmconfigsResponseBody body;

    public static QueryLinkefabricFabricReleasedrmconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasedrmconfigsResponse self = new QueryLinkefabricFabricReleasedrmconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponse setBody(QueryLinkefabricFabricReleasedrmconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleasedrmconfigsResponseBody getBody() {
        return this.body;
    }

}
