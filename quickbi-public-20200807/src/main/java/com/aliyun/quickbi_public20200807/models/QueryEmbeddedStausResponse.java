// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStausResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEmbeddedStausResponseBody body;

    public static QueryEmbeddedStausResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedStausResponse self = new QueryEmbeddedStausResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedStausResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmbeddedStausResponse setBody(QueryEmbeddedStausResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmbeddedStausResponseBody getBody() {
        return this.body;
    }

}
