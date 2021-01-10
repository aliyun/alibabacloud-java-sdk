// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPDbnodesRelatedPhysicalSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody body;

    public static QueryODPDbnodesRelatedPhysicalSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPDbnodesRelatedPhysicalSchemasResponse self = new QueryODPDbnodesRelatedPhysicalSchemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponse setBody(QueryODPDbnodesRelatedPhysicalSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody getBody() {
        return this.body;
    }

}
