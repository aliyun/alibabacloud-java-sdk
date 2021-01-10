// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPluginstatusactionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectPluginstatusactionsResponseBody body;

    public static QueryHasInspectPluginstatusactionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPluginstatusactionsResponse self = new QueryHasInspectPluginstatusactionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPluginstatusactionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectPluginstatusactionsResponse setBody(QueryHasInspectPluginstatusactionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectPluginstatusactionsResponseBody getBody() {
        return this.body;
    }

}
