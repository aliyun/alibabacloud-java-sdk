// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryOneconsoleDeploymodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOneconsoleDeploymodeResponseBody body;

    public static QueryOneconsoleDeploymodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOneconsoleDeploymodeResponse self = new QueryOneconsoleDeploymodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryOneconsoleDeploymodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOneconsoleDeploymodeResponse setBody(QueryOneconsoleDeploymodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOneconsoleDeploymodeResponseBody getBody() {
        return this.body;
    }

}
