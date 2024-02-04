// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryProduceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProduceDetailResponseBody body;

    public static QueryProduceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProduceDetailResponse self = new QueryProduceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryProduceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProduceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProduceDetailResponse setBody(QueryProduceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProduceDetailResponseBody getBody() {
        return this.body;
    }

}
