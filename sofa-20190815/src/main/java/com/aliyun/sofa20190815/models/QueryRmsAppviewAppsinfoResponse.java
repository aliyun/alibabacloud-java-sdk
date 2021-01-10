// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAppviewAppsinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAppviewAppsinfoResponseBody body;

    public static QueryRmsAppviewAppsinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAppviewAppsinfoResponse self = new QueryRmsAppviewAppsinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAppviewAppsinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAppviewAppsinfoResponse setBody(QueryRmsAppviewAppsinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAppviewAppsinfoResponseBody getBody() {
        return this.body;
    }

}
