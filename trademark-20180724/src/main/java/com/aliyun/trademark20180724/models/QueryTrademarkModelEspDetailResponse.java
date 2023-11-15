// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTrademarkModelEspDetailResponseBody body;

    public static QueryTrademarkModelEspDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspDetailResponse self = new QueryTrademarkModelEspDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkModelEspDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkModelEspDetailResponse setBody(QueryTrademarkModelEspDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkModelEspDetailResponseBody getBody() {
        return this.body;
    }

}
