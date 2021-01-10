// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchRegionResponseBody body;

    public static QueryHasCloudarchRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchRegionResponse self = new QueryHasCloudarchRegionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchRegionResponse setBody(QueryHasCloudarchRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchRegionResponseBody getBody() {
        return this.body;
    }

}
