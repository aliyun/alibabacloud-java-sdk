// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWorksResponseBody body;

    public static QueryWorksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksResponse self = new QueryWorksResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorksResponse setBody(QueryWorksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksResponseBody getBody() {
        return this.body;
    }

}
