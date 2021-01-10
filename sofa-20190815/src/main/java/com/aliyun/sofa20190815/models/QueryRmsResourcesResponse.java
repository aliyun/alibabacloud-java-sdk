// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsResourcesResponseBody body;

    public static QueryRmsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourcesResponse self = new QueryRmsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsResourcesResponse setBody(QueryRmsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsResourcesResponseBody getBody() {
        return this.body;
    }

}
