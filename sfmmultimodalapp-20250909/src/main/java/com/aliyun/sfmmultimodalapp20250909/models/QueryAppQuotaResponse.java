// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryAppQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAppQuotaResponseBody body;

    public static QueryAppQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppQuotaResponse self = new QueryAppQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppQuotaResponse setBody(QueryAppQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppQuotaResponseBody getBody() {
        return this.body;
    }

}
