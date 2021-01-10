// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktTagsResponseBody body;

    public static QueryLinkeLinktTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktTagsResponse self = new QueryLinkeLinktTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktTagsResponse setBody(QueryLinkeLinktTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktTagsResponseBody getBody() {
        return this.body;
    }

}
