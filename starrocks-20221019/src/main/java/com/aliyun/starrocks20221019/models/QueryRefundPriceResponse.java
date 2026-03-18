// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryRefundPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRefundPriceResponseBody body;

    public static QueryRefundPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundPriceResponse self = new QueryRefundPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefundPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRefundPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRefundPriceResponse setBody(QueryRefundPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRefundPriceResponseBody getBody() {
        return this.body;
    }

}
