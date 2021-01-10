// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFederationSpannerClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCFederationSpannerClusterResponseBody body;

    public static QueryLDCFederationSpannerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFederationSpannerClusterResponse self = new QueryLDCFederationSpannerClusterResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCFederationSpannerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCFederationSpannerClusterResponse setBody(QueryLDCFederationSpannerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCFederationSpannerClusterResponseBody getBody() {
        return this.body;
    }

}
