// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPDbnodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPDbnodesResponseBody body;

    public static QueryODPDbnodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPDbnodesResponse self = new QueryODPDbnodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPDbnodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPDbnodesResponse setBody(QueryODPDbnodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPDbnodesResponseBody getBody() {
        return this.body;
    }

}
