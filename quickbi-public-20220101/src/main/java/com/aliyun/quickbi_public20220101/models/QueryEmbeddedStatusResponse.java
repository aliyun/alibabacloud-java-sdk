// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEmbeddedStatusResponseBody body;

    public static QueryEmbeddedStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedStatusResponse self = new QueryEmbeddedStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmbeddedStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEmbeddedStatusResponse setBody(QueryEmbeddedStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmbeddedStatusResponseBody getBody() {
        return this.body;
    }

}
