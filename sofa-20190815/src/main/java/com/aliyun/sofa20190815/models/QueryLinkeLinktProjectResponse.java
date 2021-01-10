// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectResponseBody body;

    public static QueryLinkeLinktProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectResponse self = new QueryLinkeLinktProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectResponse setBody(QueryLinkeLinktProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectResponseBody getBody() {
        return this.body;
    }

}
