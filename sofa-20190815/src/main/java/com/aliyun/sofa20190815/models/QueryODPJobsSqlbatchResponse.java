// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPJobsSqlbatchResponseBody body;

    public static QueryODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPJobsSqlbatchResponse self = new QueryODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPJobsSqlbatchResponse setBody(QueryODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
