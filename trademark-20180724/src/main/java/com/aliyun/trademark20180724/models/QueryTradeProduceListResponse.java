// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTradeProduceListResponseBody body;

    public static QueryTradeProduceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceListResponse self = new QueryTradeProduceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeProduceListResponse setBody(QueryTradeProduceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeProduceListResponseBody getBody() {
        return this.body;
    }

}
