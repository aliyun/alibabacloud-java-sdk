// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class QueryOrderInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderInfoResponseBody body;

    public static QueryOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoResponse self = new QueryOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderInfoResponse setBody(QueryOrderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderInfoResponseBody getBody() {
        return this.body;
    }

}
