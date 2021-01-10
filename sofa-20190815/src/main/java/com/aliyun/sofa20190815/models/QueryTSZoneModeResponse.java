// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZoneModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSZoneModeResponseBody body;

    public static QueryTSZoneModeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZoneModeResponse self = new QueryTSZoneModeResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSZoneModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSZoneModeResponse setBody(QueryTSZoneModeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSZoneModeResponseBody getBody() {
        return this.body;
    }

}
