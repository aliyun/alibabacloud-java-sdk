// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRLegacyAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPLRLegacyAuthResponseBody body;

    public static QueryPLRLegacyAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRLegacyAuthResponse self = new QueryPLRLegacyAuthResponse();
        return TeaModel.build(map, self);
    }

    public QueryPLRLegacyAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPLRLegacyAuthResponse setBody(QueryPLRLegacyAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPLRLegacyAuthResponseBody getBody() {
        return this.body;
    }

}
