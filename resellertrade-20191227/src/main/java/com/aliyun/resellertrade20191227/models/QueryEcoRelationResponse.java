// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryEcoRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEcoRelationResponseBody body;

    public static QueryEcoRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEcoRelationResponse self = new QueryEcoRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryEcoRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEcoRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEcoRelationResponse setBody(QueryEcoRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEcoRelationResponseBody getBody() {
        return this.body;
    }

}
