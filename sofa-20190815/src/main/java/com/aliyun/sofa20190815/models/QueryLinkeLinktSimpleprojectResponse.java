// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSimpleprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktSimpleprojectResponseBody body;

    public static QueryLinkeLinktSimpleprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSimpleprojectResponse self = new QueryLinkeLinktSimpleprojectResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSimpleprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktSimpleprojectResponse setBody(QueryLinkeLinktSimpleprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktSimpleprojectResponseBody getBody() {
        return this.body;
    }

}
