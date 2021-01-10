// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmClientsResponseBody body;

    public static QueryMsDrmClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmClientsResponse self = new QueryMsDrmClientsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmClientsResponse setBody(QueryMsDrmClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmClientsResponseBody getBody() {
        return this.body;
    }

}
