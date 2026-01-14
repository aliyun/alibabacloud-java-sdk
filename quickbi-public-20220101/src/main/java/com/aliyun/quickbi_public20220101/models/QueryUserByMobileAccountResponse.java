// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserByMobileAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserByMobileAccountResponseBody body;

    public static QueryUserByMobileAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserByMobileAccountResponse self = new QueryUserByMobileAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserByMobileAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserByMobileAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserByMobileAccountResponse setBody(QueryUserByMobileAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserByMobileAccountResponseBody getBody() {
        return this.body;
    }

}
