// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubeOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCubeOptimizationResponseBody body;

    public static QueryCubeOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCubeOptimizationResponse self = new QueryCubeOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public QueryCubeOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCubeOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCubeOptimizationResponse setBody(QueryCubeOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCubeOptimizationResponseBody getBody() {
        return this.body;
    }

}
