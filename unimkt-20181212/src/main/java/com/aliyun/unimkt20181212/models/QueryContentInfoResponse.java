// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryContentInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryContentInfoResponseBody body;

    public static QueryContentInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentInfoResponse self = new QueryContentInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContentInfoResponse setBody(QueryContentInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContentInfoResponseBody getBody() {
        return this.body;
    }

}
