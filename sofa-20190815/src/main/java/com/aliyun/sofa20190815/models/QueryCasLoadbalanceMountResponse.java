// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceMountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasLoadbalanceMountResponseBody body;

    public static QueryCasLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceMountResponse self = new QueryCasLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceMountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasLoadbalanceMountResponse setBody(QueryCasLoadbalanceMountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasLoadbalanceMountResponseBody getBody() {
        return this.body;
    }

}
