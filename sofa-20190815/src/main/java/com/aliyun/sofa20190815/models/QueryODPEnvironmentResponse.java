// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPEnvironmentResponseBody body;

    public static QueryODPEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentResponse self = new QueryODPEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPEnvironmentResponse setBody(QueryODPEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPEnvironmentResponseBody getBody() {
        return this.body;
    }

}
