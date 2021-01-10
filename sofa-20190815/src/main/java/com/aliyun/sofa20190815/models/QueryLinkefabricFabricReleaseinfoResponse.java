// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleaseinfoResponseBody body;

    public static QueryLinkefabricFabricReleaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseinfoResponse self = new QueryLinkefabricFabricReleaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleaseinfoResponse setBody(QueryLinkefabricFabricReleaseinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleaseinfoResponseBody getBody() {
        return this.body;
    }

}
