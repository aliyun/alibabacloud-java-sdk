// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeProduceDetailResponseBody body;

    public static QueryTradeProduceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceDetailResponse self = new QueryTradeProduceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeProduceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeProduceDetailResponse setBody(QueryTradeProduceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeProduceDetailResponseBody getBody() {
        return this.body;
    }

}
