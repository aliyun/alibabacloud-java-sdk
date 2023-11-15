// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrademarkModelListResponseBody body;

    public static QueryTrademarkModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelListResponse self = new QueryTrademarkModelListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkModelListResponse setBody(QueryTrademarkModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkModelListResponseBody getBody() {
        return this.body;
    }

}
