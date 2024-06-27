// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthorizationUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAuthorizationUserListResponseBody body;

    public static QueryAuthorizationUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthorizationUserListResponse self = new QueryAuthorizationUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthorizationUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthorizationUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuthorizationUserListResponse setBody(QueryAuthorizationUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthorizationUserListResponseBody getBody() {
        return this.body;
    }

}
