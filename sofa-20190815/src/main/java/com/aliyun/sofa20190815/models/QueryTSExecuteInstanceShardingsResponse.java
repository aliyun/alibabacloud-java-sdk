// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceShardingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSExecuteInstanceShardingsResponseBody body;

    public static QueryTSExecuteInstanceShardingsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceShardingsResponse self = new QueryTSExecuteInstanceShardingsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceShardingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSExecuteInstanceShardingsResponse setBody(QueryTSExecuteInstanceShardingsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSExecuteInstanceShardingsResponseBody getBody() {
        return this.body;
    }

}
