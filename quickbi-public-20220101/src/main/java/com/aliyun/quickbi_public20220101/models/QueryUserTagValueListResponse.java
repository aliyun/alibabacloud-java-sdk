// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagValueListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserTagValueListResponseBody body;

    public static QueryUserTagValueListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagValueListResponse self = new QueryUserTagValueListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTagValueListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserTagValueListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserTagValueListResponse setBody(QueryUserTagValueListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserTagValueListResponseBody getBody() {
        return this.body;
    }

}
