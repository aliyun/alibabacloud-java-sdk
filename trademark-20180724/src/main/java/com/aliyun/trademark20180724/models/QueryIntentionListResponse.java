// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIntentionListResponseBody body;

    public static QueryIntentionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionListResponse self = new QueryIntentionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIntentionListResponse setBody(QueryIntentionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionListResponseBody getBody() {
        return this.body;
    }

}
