// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchCellResponseBody body;

    public static QueryHasCloudarchCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchCellResponse self = new QueryHasCloudarchCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchCellResponse setBody(QueryHasCloudarchCellResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchCellResponseBody getBody() {
        return this.body;
    }

}
