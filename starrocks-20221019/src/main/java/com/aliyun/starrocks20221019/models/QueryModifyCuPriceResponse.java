// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyCuPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyCuPriceResponseBody body;

    public static QueryModifyCuPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyCuPriceResponse self = new QueryModifyCuPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyCuPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyCuPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyCuPriceResponse setBody(QueryModifyCuPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyCuPriceResponseBody getBody() {
        return this.body;
    }

}
