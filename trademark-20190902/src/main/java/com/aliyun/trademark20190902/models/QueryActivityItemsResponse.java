// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryActivityItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryActivityItemsResponseBody body;

    public static QueryActivityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsResponse self = new QueryActivityItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryActivityItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryActivityItemsResponse setBody(QueryActivityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryActivityItemsResponseBody getBody() {
        return this.body;
    }

}
