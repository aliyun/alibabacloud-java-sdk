// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasDatabaseSchemaResponseBody body;

    public static QueryCasDatabaseSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSchemaResponse self = new QueryCasDatabaseSchemaResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasDatabaseSchemaResponse setBody(QueryCasDatabaseSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasDatabaseSchemaResponseBody getBody() {
        return this.body;
    }

}
