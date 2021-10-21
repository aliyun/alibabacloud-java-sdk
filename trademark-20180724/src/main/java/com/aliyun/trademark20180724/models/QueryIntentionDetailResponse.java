// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIntentionDetailResponseBody body;

    public static QueryIntentionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionDetailResponse self = new QueryIntentionDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntentionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntentionDetailResponse setBody(QueryIntentionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntentionDetailResponseBody getBody() {
        return this.body;
    }

}
