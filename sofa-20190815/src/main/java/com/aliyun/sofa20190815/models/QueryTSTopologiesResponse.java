// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTopologiesResponseBody body;

    public static QueryTSTopologiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologiesResponse self = new QueryTSTopologiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTopologiesResponse setBody(QueryTSTopologiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTopologiesResponseBody getBody() {
        return this.body;
    }

}
