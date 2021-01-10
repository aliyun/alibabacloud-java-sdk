// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktIterationResponseBody body;

    public static QueryLinkeLinktIterationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationResponse self = new QueryLinkeLinktIterationResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktIterationResponse setBody(QueryLinkeLinktIterationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktIterationResponseBody getBody() {
        return this.body;
    }

}
