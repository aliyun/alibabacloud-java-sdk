// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryProduceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProduceListResponseBody body;

    public static QueryProduceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProduceListResponse self = new QueryProduceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProduceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProduceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProduceListResponse setBody(QueryProduceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProduceListResponseBody getBody() {
        return this.body;
    }

}
