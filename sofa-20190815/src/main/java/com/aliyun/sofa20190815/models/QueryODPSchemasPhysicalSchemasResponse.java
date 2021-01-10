// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasPhysicalSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSchemasPhysicalSchemasResponseBody body;

    public static QueryODPSchemasPhysicalSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasPhysicalSchemasResponse self = new QueryODPSchemasPhysicalSchemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasPhysicalSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSchemasPhysicalSchemasResponse setBody(QueryODPSchemasPhysicalSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSchemasPhysicalSchemasResponseBody getBody() {
        return this.body;
    }

}
