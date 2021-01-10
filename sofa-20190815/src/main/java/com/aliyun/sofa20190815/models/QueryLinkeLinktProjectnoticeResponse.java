// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectnoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectnoticeResponseBody body;

    public static QueryLinkeLinktProjectnoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectnoticeResponse self = new QueryLinkeLinktProjectnoticeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectnoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectnoticeResponse setBody(QueryLinkeLinktProjectnoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectnoticeResponseBody getBody() {
        return this.body;
    }

}
