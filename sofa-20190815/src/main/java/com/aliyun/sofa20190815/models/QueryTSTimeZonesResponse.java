// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTimeZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTimeZonesResponseBody body;

    public static QueryTSTimeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTimeZonesResponse self = new QueryTSTimeZonesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTimeZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTimeZonesResponse setBody(QueryTSTimeZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTimeZonesResponseBody getBody() {
        return this.body;
    }

}
