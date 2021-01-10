// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaFilecontentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaFilecontentResponseBody body;

    public static QueryLinkeLinkaFilecontentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaFilecontentResponse self = new QueryLinkeLinkaFilecontentResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaFilecontentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaFilecontentResponse setBody(QueryLinkeLinkaFilecontentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaFilecontentResponseBody getBody() {
        return this.body;
    }

}
