// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryExecuteInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExecuteInfoResponseBody body;

    public static QueryExecuteInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExecuteInfoResponse self = new QueryExecuteInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryExecuteInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExecuteInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExecuteInfoResponse setBody(QueryExecuteInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExecuteInfoResponseBody getBody() {
        return this.body;
    }

}
