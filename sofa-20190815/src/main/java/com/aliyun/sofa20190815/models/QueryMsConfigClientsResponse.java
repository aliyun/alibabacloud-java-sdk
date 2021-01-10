// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsConfigClientsResponseBody body;

    public static QueryMsConfigClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigClientsResponse self = new QueryMsConfigClientsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsConfigClientsResponse setBody(QueryMsConfigClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsConfigClientsResponseBody getBody() {
        return this.body;
    }

}
