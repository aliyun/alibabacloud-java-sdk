// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSZonesResponseBody body;

    public static QueryTSZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZonesResponse self = new QueryTSZonesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSZonesResponse setBody(QueryTSZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSZonesResponseBody getBody() {
        return this.body;
    }

}
