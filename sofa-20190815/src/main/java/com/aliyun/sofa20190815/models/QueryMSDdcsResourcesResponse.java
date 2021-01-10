// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsResourcesResponseBody body;

    public static QueryMSDdcsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsResourcesResponse self = new QueryMSDdcsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsResourcesResponse setBody(QueryMSDdcsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsResourcesResponseBody getBody() {
        return this.body;
    }

}
