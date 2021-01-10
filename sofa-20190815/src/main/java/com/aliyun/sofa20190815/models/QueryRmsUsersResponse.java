// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsUsersResponseBody body;

    public static QueryRmsUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsUsersResponse self = new QueryRmsUsersResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsUsersResponse setBody(QueryRmsUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsUsersResponseBody getBody() {
        return this.body;
    }

}
