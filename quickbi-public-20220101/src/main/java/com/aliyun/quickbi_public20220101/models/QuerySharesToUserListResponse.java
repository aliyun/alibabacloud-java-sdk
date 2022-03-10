// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySharesToUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySharesToUserListResponseBody body;

    public static QuerySharesToUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySharesToUserListResponse self = new QuerySharesToUserListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySharesToUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySharesToUserListResponse setBody(QuerySharesToUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySharesToUserListResponseBody getBody() {
        return this.body;
    }

}
