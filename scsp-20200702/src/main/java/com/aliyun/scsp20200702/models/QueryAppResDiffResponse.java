// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResDiffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppResDiffResponseBody body;

    public static QueryAppResDiffResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResDiffResponse self = new QueryAppResDiffResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppResDiffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppResDiffResponse setBody(QueryAppResDiffResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppResDiffResponseBody getBody() {
        return this.body;
    }

}
