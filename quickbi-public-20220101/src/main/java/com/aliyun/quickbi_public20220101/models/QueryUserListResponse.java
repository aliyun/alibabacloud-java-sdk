// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserListResponseBody body;

    public static QueryUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListResponse self = new QueryUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserListResponse setBody(QueryUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserListResponseBody getBody() {
        return this.body;
    }

}
