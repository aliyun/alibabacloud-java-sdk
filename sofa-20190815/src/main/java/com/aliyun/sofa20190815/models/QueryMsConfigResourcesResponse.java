// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsConfigResourcesResponseBody body;

    public static QueryMsConfigResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigResourcesResponse self = new QueryMsConfigResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsConfigResourcesResponse setBody(QueryMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
