// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsidburlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsidburlResponseBody body;

    public static QueryLinkefabricFabricUrlsidburlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsidburlResponse self = new QueryLinkefabricFabricUrlsidburlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsidburlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsidburlResponse setBody(QueryLinkefabricFabricUrlsidburlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsidburlResponseBody getBody() {
        return this.body;
    }

}
