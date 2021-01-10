// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudallstrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCloudallstrategyResponseBody body;

    public static QueryLinkefabricFabricCloudallstrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudallstrategyResponse self = new QueryLinkefabricFabricCloudallstrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudallstrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCloudallstrategyResponse setBody(QueryLinkefabricFabricCloudallstrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCloudallstrategyResponseBody getBody() {
        return this.body;
    }

}
