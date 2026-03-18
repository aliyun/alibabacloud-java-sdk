// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryRenewPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRenewPriceResponseBody body;

    public static QueryRenewPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceResponse self = new QueryRenewPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRenewPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRenewPriceResponse setBody(QueryRenewPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRenewPriceResponseBody getBody() {
        return this.body;
    }

}
