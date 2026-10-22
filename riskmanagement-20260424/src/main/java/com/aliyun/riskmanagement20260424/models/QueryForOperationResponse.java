// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryForOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryForOperationResponseBody body;

    public static QueryForOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryForOperationResponse self = new QueryForOperationResponse();
        return TeaModel.build(map, self);
    }

    public QueryForOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryForOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryForOperationResponse setBody(QueryForOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryForOperationResponseBody getBody() {
        return this.body;
    }

}
