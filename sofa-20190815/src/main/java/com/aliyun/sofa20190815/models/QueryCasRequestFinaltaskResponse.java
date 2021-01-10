// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestFinaltaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasRequestFinaltaskResponseBody body;

    public static QueryCasRequestFinaltaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestFinaltaskResponse self = new QueryCasRequestFinaltaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestFinaltaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasRequestFinaltaskResponse setBody(QueryCasRequestFinaltaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasRequestFinaltaskResponseBody getBody() {
        return this.body;
    }

}
