// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeProduceListResponseBody body;

    public static QueryTradeProduceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceListResponse self = new QueryTradeProduceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeProduceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeProduceListResponse setBody(QueryTradeProduceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeProduceListResponseBody getBody() {
        return this.body;
    }

}
