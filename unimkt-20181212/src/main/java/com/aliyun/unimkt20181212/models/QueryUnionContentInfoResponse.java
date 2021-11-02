// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionContentInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionContentInfoResponseBody body;

    public static QueryUnionContentInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionContentInfoResponse self = new QueryUnionContentInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionContentInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionContentInfoResponse setBody(QueryUnionContentInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionContentInfoResponseBody getBody() {
        return this.body;
    }

}
