// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagMetaListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserTagMetaListResponseBody body;

    public static QueryUserTagMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagMetaListResponse self = new QueryUserTagMetaListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTagMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserTagMetaListResponse setBody(QueryUserTagMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserTagMetaListResponseBody getBody() {
        return this.body;
    }

}
