// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserInfoByUserIdResponseBody body;

    public static QueryUserInfoByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByUserIdResponse self = new QueryUserInfoByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserInfoByUserIdResponse setBody(QueryUserInfoByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserInfoByUserIdResponseBody getBody() {
        return this.body;
    }

}
