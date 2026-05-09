// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class QueryTaskConcurrencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskConcurrencyResponseBody body;

    public static QueryTaskConcurrencyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskConcurrencyResponse self = new QueryTaskConcurrencyResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskConcurrencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskConcurrencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskConcurrencyResponse setBody(QueryTaskConcurrencyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskConcurrencyResponseBody getBody() {
        return this.body;
    }

}
