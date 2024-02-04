// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkModelDetailResponseBody body;

    public static QueryTrademarkModelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelDetailResponse self = new QueryTrademarkModelDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkModelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkModelDetailResponse setBody(QueryTrademarkModelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkModelDetailResponseBody getBody() {
        return this.body;
    }

}
