// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRLegacyEnabledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPLRLegacyEnabledResponseBody body;

    public static QueryPLRLegacyEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRLegacyEnabledResponse self = new QueryPLRLegacyEnabledResponse();
        return TeaModel.build(map, self);
    }

    public QueryPLRLegacyEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPLRLegacyEnabledResponse setBody(QueryPLRLegacyEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPLRLegacyEnabledResponseBody getBody() {
        return this.body;
    }

}
