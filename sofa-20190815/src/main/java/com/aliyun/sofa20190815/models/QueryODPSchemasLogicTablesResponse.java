// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasLogicTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPSchemasLogicTablesResponseBody body;

    public static QueryODPSchemasLogicTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasLogicTablesResponse self = new QueryODPSchemasLogicTablesResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasLogicTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPSchemasLogicTablesResponse setBody(QueryODPSchemasLogicTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPSchemasLogicTablesResponseBody getBody() {
        return this.body;
    }

}
