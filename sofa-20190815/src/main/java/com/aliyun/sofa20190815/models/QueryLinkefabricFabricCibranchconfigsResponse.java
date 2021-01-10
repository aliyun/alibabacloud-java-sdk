// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCibranchconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCibranchconfigsResponseBody body;

    public static QueryLinkefabricFabricCibranchconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCibranchconfigsResponse self = new QueryLinkefabricFabricCibranchconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCibranchconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCibranchconfigsResponse setBody(QueryLinkefabricFabricCibranchconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCibranchconfigsResponseBody getBody() {
        return this.body;
    }

}
