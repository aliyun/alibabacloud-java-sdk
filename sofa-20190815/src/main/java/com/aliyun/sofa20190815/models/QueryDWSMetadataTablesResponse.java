// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSMetadataTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDWSMetadataTablesResponseBody body;

    public static QueryDWSMetadataTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSMetadataTablesResponse self = new QueryDWSMetadataTablesResponse();
        return TeaModel.build(map, self);
    }

    public QueryDWSMetadataTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDWSMetadataTablesResponse setBody(QueryDWSMetadataTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDWSMetadataTablesResponseBody getBody() {
        return this.body;
    }

}
