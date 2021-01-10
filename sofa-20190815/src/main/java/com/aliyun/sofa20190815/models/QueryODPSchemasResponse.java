// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSchemasResponseBody body;

    public static QueryODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasResponse self = new QueryODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSchemasResponse setBody(QueryODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSchemasResponseBody getBody() {
        return this.body;
    }

}
