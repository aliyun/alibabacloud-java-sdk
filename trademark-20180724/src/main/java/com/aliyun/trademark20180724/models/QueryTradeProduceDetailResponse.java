// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTradeProduceDetailResponseBody body;

    public static QueryTradeProduceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceDetailResponse self = new QueryTradeProduceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTradeProduceDetailResponse setBody(QueryTradeProduceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTradeProduceDetailResponseBody getBody() {
        return this.body;
    }

}
