// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPJobsSqlbatchProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPJobsSqlbatchProgressResponseBody body;

    public static QueryODPJobsSqlbatchProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPJobsSqlbatchProgressResponse self = new QueryODPJobsSqlbatchProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPJobsSqlbatchProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPJobsSqlbatchProgressResponse setBody(QueryODPJobsSqlbatchProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPJobsSqlbatchProgressResponseBody getBody() {
        return this.body;
    }

}
