// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QuerySelectOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySelectOptionsResponseBody body;

    public static QuerySelectOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySelectOptionsResponse self = new QuerySelectOptionsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySelectOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySelectOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySelectOptionsResponse setBody(QuerySelectOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySelectOptionsResponseBody getBody() {
        return this.body;
    }

}
