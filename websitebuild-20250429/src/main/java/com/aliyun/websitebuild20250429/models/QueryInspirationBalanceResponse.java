// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInspirationBalanceResponseBody body;

    public static QueryInspirationBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationBalanceResponse self = new QueryInspirationBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryInspirationBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInspirationBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInspirationBalanceResponse setBody(QueryInspirationBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInspirationBalanceResponseBody getBody() {
        return this.body;
    }

}
