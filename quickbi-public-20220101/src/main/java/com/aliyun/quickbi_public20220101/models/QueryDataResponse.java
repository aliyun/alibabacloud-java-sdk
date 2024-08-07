// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataResponseBody body;

    public static QueryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataResponse self = new QueryDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataResponse setBody(QueryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataResponseBody getBody() {
        return this.body;
    }

}
