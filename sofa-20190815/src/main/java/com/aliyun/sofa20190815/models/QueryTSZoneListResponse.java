// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSZoneListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSZoneListResponseBody body;

    public static QueryTSZoneListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSZoneListResponse self = new QueryTSZoneListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSZoneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSZoneListResponse setBody(QueryTSZoneListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSZoneListResponseBody getBody() {
        return this.body;
    }

}
