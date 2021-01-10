// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmHostsResponseBody body;

    public static QueryMsDrmHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmHostsResponse self = new QueryMsDrmHostsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmHostsResponse setBody(QueryMsDrmHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmHostsResponseBody getBody() {
        return this.body;
    }

}
