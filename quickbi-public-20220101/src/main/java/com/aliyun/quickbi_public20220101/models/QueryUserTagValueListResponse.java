// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagValueListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryUserTagValueListResponse setBody(QueryUserTagValueListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserTagValueListResponseBody getBody() {
        return this.body;
    }

}
