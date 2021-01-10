// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsclouddrmurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlsclouddrmurlResponseBody body;

    public static QueryLinkefabricFabricUrlsclouddrmurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsclouddrmurlResponse self = new QueryLinkefabricFabricUrlsclouddrmurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsclouddrmurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlsclouddrmurlResponse setBody(QueryLinkefabricFabricUrlsclouddrmurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlsclouddrmurlResponseBody getBody() {
        return this.body;
    }

}
