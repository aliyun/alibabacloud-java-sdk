// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsRcSyncClusterResponseBody body;

    public static QueryMsRcSyncClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncClusterResponse self = new QueryMsRcSyncClusterResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsRcSyncClusterResponse setBody(QueryMsRcSyncClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsRcSyncClusterResponseBody getBody() {
        return this.body;
    }

}
