// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIntentionListResponseBody body;

    public static QueryIntentionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionListResponse self = new QueryIntentionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionListResponse setBody(QueryIntentionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionListResponseBody getBody() {
        return this.body;
    }

}
