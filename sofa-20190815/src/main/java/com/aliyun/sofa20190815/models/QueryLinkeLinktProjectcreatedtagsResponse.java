// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectcreatedtagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectcreatedtagsResponseBody body;

    public static QueryLinkeLinktProjectcreatedtagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectcreatedtagsResponse self = new QueryLinkeLinktProjectcreatedtagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectcreatedtagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectcreatedtagsResponse setBody(QueryLinkeLinktProjectcreatedtagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectcreatedtagsResponseBody getBody() {
        return this.body;
    }

}
