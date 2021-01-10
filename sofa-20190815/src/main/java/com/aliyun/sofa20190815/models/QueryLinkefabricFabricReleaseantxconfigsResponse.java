// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseantxconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleaseantxconfigsResponseBody body;

    public static QueryLinkefabricFabricReleaseantxconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseantxconfigsResponse self = new QueryLinkefabricFabricReleaseantxconfigsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseantxconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleaseantxconfigsResponse setBody(QueryLinkefabricFabricReleaseantxconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleaseantxconfigsResponseBody getBody() {
        return this.body;
    }

}
