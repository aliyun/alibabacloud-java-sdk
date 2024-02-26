// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStatisticResponseBody body;

    public static QueryStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticResponse self = new QueryStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStatisticResponse setBody(QueryStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatisticResponseBody getBody() {
        return this.body;
    }

}
