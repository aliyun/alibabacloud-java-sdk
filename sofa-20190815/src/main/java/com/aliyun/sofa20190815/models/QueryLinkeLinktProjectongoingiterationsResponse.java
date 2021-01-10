// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectongoingiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectongoingiterationsResponseBody body;

    public static QueryLinkeLinktProjectongoingiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectongoingiterationsResponse self = new QueryLinkeLinktProjectongoingiterationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectongoingiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectongoingiterationsResponse setBody(QueryLinkeLinktProjectongoingiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectongoingiterationsResponseBody getBody() {
        return this.body;
    }

}
