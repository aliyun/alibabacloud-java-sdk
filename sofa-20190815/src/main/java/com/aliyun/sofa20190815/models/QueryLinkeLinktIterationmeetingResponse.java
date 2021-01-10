// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationmeetingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktIterationmeetingResponseBody body;

    public static QueryLinkeLinktIterationmeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationmeetingResponse self = new QueryLinkeLinktIterationmeetingResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationmeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktIterationmeetingResponse setBody(QueryLinkeLinktIterationmeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktIterationmeetingResponseBody getBody() {
        return this.body;
    }

}
