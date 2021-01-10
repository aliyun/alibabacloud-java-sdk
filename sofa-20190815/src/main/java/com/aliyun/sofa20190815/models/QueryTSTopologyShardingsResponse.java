// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyShardingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologyShardingsResponseBody body;

    public static QueryTSTopologyShardingsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyShardingsResponse self = new QueryTSTopologyShardingsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyShardingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologyShardingsResponse setBody(QueryTSTopologyShardingsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologyShardingsResponseBody getBody() {
        return this.body;
    }

}
