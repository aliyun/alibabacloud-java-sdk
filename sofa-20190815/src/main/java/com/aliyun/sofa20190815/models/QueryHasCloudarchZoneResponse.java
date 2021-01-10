// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchZoneResponseBody body;

    public static QueryHasCloudarchZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchZoneResponse self = new QueryHasCloudarchZoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchZoneResponse setBody(QueryHasCloudarchZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchZoneResponseBody getBody() {
        return this.body;
    }

}
