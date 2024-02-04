// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkModelEspListResponseBody body;

    public static QueryTrademarkModelEspListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspListResponse self = new QueryTrademarkModelEspListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkModelEspListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkModelEspListResponse setBody(QueryTrademarkModelEspListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkModelEspListResponseBody getBody() {
        return this.body;
    }

}
