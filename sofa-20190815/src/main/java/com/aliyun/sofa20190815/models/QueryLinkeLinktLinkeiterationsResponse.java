// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktLinkeiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktLinkeiterationsResponseBody body;

    public static QueryLinkeLinktLinkeiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktLinkeiterationsResponse self = new QueryLinkeLinktLinkeiterationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktLinkeiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktLinkeiterationsResponse setBody(QueryLinkeLinktLinkeiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktLinkeiterationsResponseBody getBody() {
        return this.body;
    }

}
