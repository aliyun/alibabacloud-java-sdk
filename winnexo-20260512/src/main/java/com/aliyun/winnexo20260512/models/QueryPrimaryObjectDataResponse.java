// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryPrimaryObjectDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPrimaryObjectDataResponseBody body;

    public static QueryPrimaryObjectDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrimaryObjectDataResponse self = new QueryPrimaryObjectDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrimaryObjectDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPrimaryObjectDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPrimaryObjectDataResponse setBody(QueryPrimaryObjectDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPrimaryObjectDataResponseBody getBody() {
        return this.body;
    }

}
