// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmResourcesResponseBody body;

    public static QueryMsDrmResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmResourcesResponse self = new QueryMsDrmResourcesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmResourcesResponse setBody(QueryMsDrmResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmResourcesResponseBody getBody() {
        return this.body;
    }

}
