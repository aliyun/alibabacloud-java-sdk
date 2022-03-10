// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryUserInfoByAccountResponse setBody(QueryUserInfoByAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserInfoByAccountResponseBody getBody() {
        return this.body;
    }

}
