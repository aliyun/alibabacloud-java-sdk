// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserInfoByAccountResponseBody body;

    public static QueryUserInfoByAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByAccountResponse self = new QueryUserInfoByAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserInfoByAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserInfoByAccountResponse setBody(QueryUserInfoByAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserInfoByAccountResponseBody getBody() {
        return this.body;
    }

}
