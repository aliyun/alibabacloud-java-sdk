// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkOnSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkOnSaleResponseBody body;

    public static QueryTrademarkOnSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkOnSaleResponse self = new QueryTrademarkOnSaleResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkOnSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkOnSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkOnSaleResponse setBody(QueryTrademarkOnSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkOnSaleResponseBody getBody() {
        return this.body;
    }

}
