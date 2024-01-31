// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryRecommendByCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecommendByCodeResponseBody body;

    public static QueryRecommendByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecommendByCodeResponse self = new QueryRecommendByCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecommendByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecommendByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecommendByCodeResponse setBody(QueryRecommendByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecommendByCodeResponseBody getBody() {
        return this.body;
    }

}
