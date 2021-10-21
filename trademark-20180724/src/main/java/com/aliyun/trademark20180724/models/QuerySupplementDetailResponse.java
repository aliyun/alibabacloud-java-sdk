// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySupplementDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySupplementDetailResponseBody body;

    public static QuerySupplementDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplementDetailResponse self = new QuerySupplementDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupplementDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupplementDetailResponse setBody(QuerySupplementDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupplementDetailResponseBody getBody() {
        return this.body;
    }

}
