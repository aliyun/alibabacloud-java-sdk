// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaFilecontentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaFilecontentsResponseBody body;

    public static QueryLinkeLinkaFilecontentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaFilecontentsResponse self = new QueryLinkeLinkaFilecontentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaFilecontentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaFilecontentsResponse setBody(QueryLinkeLinkaFilecontentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaFilecontentsResponseBody getBody() {
        return this.body;
    }

}
