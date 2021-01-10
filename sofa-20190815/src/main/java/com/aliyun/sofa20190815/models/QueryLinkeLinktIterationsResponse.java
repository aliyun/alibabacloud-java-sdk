// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktIterationsResponseBody body;

    public static QueryLinkeLinktIterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationsResponse self = new QueryLinkeLinktIterationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktIterationsResponse setBody(QueryLinkeLinktIterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktIterationsResponseBody getBody() {
        return this.body;
    }

}
