// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryEnableMultiAzPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEnableMultiAzPriceResponseBody body;

    public static QueryEnableMultiAzPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnableMultiAzPriceResponse self = new QueryEnableMultiAzPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnableMultiAzPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEnableMultiAzPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEnableMultiAzPriceResponse setBody(QueryEnableMultiAzPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEnableMultiAzPriceResponseBody getBody() {
        return this.body;
    }

}
