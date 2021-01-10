// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlscloudlegourlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlscloudlegourlResponseBody body;

    public static QueryLinkefabricFabricUrlscloudlegourlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlscloudlegourlResponse self = new QueryLinkefabricFabricUrlscloudlegourlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlscloudlegourlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlscloudlegourlResponse setBody(QueryLinkefabricFabricUrlscloudlegourlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlscloudlegourlResponseBody getBody() {
        return this.body;
    }

}
