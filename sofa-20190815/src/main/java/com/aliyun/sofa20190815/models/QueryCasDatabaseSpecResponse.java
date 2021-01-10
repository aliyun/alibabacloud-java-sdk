// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasDatabaseSpecResponseBody body;

    public static QueryCasDatabaseSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSpecResponse self = new QueryCasDatabaseSpecResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasDatabaseSpecResponse setBody(QueryCasDatabaseSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasDatabaseSpecResponseBody getBody() {
        return this.body;
    }

}
