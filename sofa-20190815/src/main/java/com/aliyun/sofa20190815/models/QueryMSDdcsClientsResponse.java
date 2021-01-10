// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsClientsResponseBody body;

    public static QueryMSDdcsClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientsResponse self = new QueryMSDdcsClientsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsClientsResponse setBody(QueryMSDdcsClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsClientsResponseBody getBody() {
        return this.body;
    }

}
