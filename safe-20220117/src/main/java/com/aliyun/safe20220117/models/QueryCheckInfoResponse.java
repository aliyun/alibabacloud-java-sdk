// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryCheckInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCheckInfoResponseBody body;

    public static QueryCheckInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCheckInfoResponse self = new QueryCheckInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCheckInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCheckInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCheckInfoResponse setBody(QueryCheckInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCheckInfoResponseBody getBody() {
        return this.body;
    }

}
