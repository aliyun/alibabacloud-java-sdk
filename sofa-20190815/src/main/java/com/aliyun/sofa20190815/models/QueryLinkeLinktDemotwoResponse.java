// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktDemotwoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktDemotwoResponseBody body;

    public static QueryLinkeLinktDemotwoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktDemotwoResponse self = new QueryLinkeLinktDemotwoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktDemotwoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktDemotwoResponse setBody(QueryLinkeLinktDemotwoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktDemotwoResponseBody getBody() {
        return this.body;
    }

}
