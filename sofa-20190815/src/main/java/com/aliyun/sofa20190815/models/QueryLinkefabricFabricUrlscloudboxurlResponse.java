// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlscloudboxurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricUrlscloudboxurlResponseBody body;

    public static QueryLinkefabricFabricUrlscloudboxurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlscloudboxurlResponse self = new QueryLinkefabricFabricUrlscloudboxurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlscloudboxurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricUrlscloudboxurlResponse setBody(QueryLinkefabricFabricUrlscloudboxurlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricUrlscloudboxurlResponseBody getBody() {
        return this.body;
    }

}
