// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkPriceResponseBody body;

    public static QueryTrademarkPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceResponse self = new QueryTrademarkPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkPriceResponse setBody(QueryTrademarkPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkPriceResponseBody getBody() {
        return this.body;
    }

}
