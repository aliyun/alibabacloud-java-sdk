// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyNodeNumberPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyNodeNumberPriceResponseBody body;

    public static QueryModifyNodeNumberPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyNodeNumberPriceResponse self = new QueryModifyNodeNumberPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyNodeNumberPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyNodeNumberPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyNodeNumberPriceResponse setBody(QueryModifyNodeNumberPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyNodeNumberPriceResponseBody getBody() {
        return this.body;
    }

}
