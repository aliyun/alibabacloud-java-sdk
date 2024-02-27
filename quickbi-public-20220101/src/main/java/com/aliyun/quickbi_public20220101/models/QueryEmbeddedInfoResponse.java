// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEmbeddedInfoResponseBody body;

    public static QueryEmbeddedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedInfoResponse self = new QueryEmbeddedInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmbeddedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEmbeddedInfoResponse setBody(QueryEmbeddedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmbeddedInfoResponseBody getBody() {
        return this.body;
    }

}
