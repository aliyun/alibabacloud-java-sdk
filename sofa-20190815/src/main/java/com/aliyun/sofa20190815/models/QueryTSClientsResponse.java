// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSClientsResponseBody body;

    public static QueryTSClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSClientsResponse self = new QueryTSClientsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSClientsResponse setBody(QueryTSClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSClientsResponseBody getBody() {
        return this.body;
    }

}
