// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmClientInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmClientInfosResponseBody body;

    public static QueryMsDrmClientInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmClientInfosResponse self = new QueryMsDrmClientInfosResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmClientInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmClientInfosResponse setBody(QueryMsDrmClientInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmClientInfosResponseBody getBody() {
        return this.body;
    }

}
