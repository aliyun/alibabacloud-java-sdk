// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class QueryOrderPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderPriceResponseBody body;

    public static QueryOrderPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderPriceResponse self = new QueryOrderPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderPriceResponse setBody(QueryOrderPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderPriceResponseBody getBody() {
        return this.body;
    }

}
