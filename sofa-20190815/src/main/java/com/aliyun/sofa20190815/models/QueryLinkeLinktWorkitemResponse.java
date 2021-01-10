// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktWorkitemResponseBody body;

    public static QueryLinkeLinktWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktWorkitemResponse self = new QueryLinkeLinktWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktWorkitemResponse setBody(QueryLinkeLinktWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktWorkitemResponseBody getBody() {
        return this.body;
    }

}
