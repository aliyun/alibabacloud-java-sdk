// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMemoryConfigResponseBody body;

    public static QueryMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMemoryConfigResponse self = new QueryMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMemoryConfigResponse setBody(QueryMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
