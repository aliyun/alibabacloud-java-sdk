// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasemsgconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleasemsgconfigsResponseBody body;

    public static QueryLinkefabricFabricReleasemsgconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasemsgconfigsResponse self = new QueryLinkefabricFabricReleasemsgconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponse setBody(QueryLinkefabricFabricReleasemsgconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleasemsgconfigsResponseBody getBody() {
        return this.body;
    }

}
