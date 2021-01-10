// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgtypeinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody body;

    public static QueryLinkefabricFabricCloudmsgtypeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgtypeinfoResponse self = new QueryLinkefabricFabricCloudmsgtypeinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponse setBody(QueryLinkefabricFabricCloudmsgtypeinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody getBody() {
        return this.body;
    }

}
