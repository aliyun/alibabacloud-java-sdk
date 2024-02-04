// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIntentionDetailResponseBody body;

    public static QueryIntentionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionDetailResponse self = new QueryIntentionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIntentionDetailResponse setBody(QueryIntentionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionDetailResponseBody getBody() {
        return this.body;
    }

}
