// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudenvinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCloudenvinfoResponseBody body;

    public static QueryLinkefabricFabricCloudenvinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudenvinfoResponse self = new QueryLinkefabricFabricCloudenvinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudenvinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCloudenvinfoResponse setBody(QueryLinkefabricFabricCloudenvinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCloudenvinfoResponseBody getBody() {
        return this.body;
    }

}
