// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchLocalallcellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchLocalallcellResponseBody body;

    public static QueryHasCloudarchLocalallcellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchLocalallcellResponse self = new QueryHasCloudarchLocalallcellResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchLocalallcellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchLocalallcellResponse setBody(QueryHasCloudarchLocalallcellResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchLocalallcellResponseBody getBody() {
        return this.body;
    }

}
