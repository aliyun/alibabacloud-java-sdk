// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricTechstackconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricTechstackconfigsResponseBody body;

    public static QueryLinkefabricFabricTechstackconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricTechstackconfigsResponse self = new QueryLinkefabricFabricTechstackconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricTechstackconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricTechstackconfigsResponse setBody(QueryLinkefabricFabricTechstackconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricTechstackconfigsResponseBody getBody() {
        return this.body;
    }

}
