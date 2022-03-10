// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEmbeddedInfoResponseBody body;

    public static QueryEmbeddedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedInfoResponse self = new QueryEmbeddedInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmbeddedInfoResponse setBody(QueryEmbeddedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmbeddedInfoResponseBody getBody() {
        return this.body;
    }

}
