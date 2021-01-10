// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSubprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktSubprojectsResponseBody body;

    public static QueryLinkeLinktSubprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSubprojectsResponse self = new QueryLinkeLinktSubprojectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSubprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktSubprojectsResponse setBody(QueryLinkeLinktSubprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktSubprojectsResponseBody getBody() {
        return this.body;
    }

}
