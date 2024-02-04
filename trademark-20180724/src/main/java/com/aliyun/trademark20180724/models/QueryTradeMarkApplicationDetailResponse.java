// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTradeMarkApplicationDetailResponseBody body;

    public static QueryTradeMarkApplicationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationDetailResponse self = new QueryTradeMarkApplicationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeMarkApplicationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTradeMarkApplicationDetailResponse setBody(QueryTradeMarkApplicationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBody getBody() {
        return this.body;
    }

}
